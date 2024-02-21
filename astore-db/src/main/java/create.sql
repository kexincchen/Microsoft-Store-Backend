CREATE TABLE applications (
                              id INT AUTO_INCREMENT PRIMARY KEY,
                              name VARCHAR(255) NOT NULL,
                              description TEXT,
                              publisher VARCHAR(255),
                              category VARCHAR(255),
                              price DECIMAL(10, 2),
                              image_url VARCHAR(255),
                              release_date DATE
);

CREATE TABLE version_histories (
                                   id INT AUTO_INCREMENT PRIMARY KEY,
                                   application_id INT,
                                   version VARCHAR(255) NOT NULL,
                                   release_date DATE,
                                   update_info TEXT,
                                   FOREIGN KEY (application_id) REFERENCES applications(id)
);

CREATE TABLE search_logs (
                             id INT AUTO_INCREMENT PRIMARY KEY,
                             query VARCHAR(255) NOT NULL,
                             result_count INT,
                             search_date DATETIME,
                             user_id INT
);


CREATE TABLE reviews (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         application_id INT,
                         user_id INT,
                         comment TEXT,
                         rating DECIMAL(3, 2),
                         comment_date DATETIME,
                         FOREIGN KEY (application_id) REFERENCES applications(id)
);

CREATE TABLE purchase_records (
                                  id INT AUTO_INCREMENT PRIMARY KEY,
                                  user_id INT,
                                  application_id INT,
                                  purchase_date DATETIME,
                                  price DECIMAL(10, 2),
                                  FOREIGN KEY (application_id) REFERENCES applications(id)
);

CREATE TABLE distribution_records (
                                      id INT AUTO_INCREMENT PRIMARY KEY,
                                      purchase_id INT,
                                      token VARCHAR(255),
                                      valid_until DATETIME,
                                      FOREIGN KEY (purchase_id) REFERENCES purchase_records(id)
);

CREATE TABLE users (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       username VARCHAR(255) NOT NULL UNIQUE,
                       password VARCHAR(255) NOT NULL,
                       email VARCHAR(255) UNIQUE,
                       registration_date DATETIME
);

CREATE TABLE user_activities (
                                 id INT AUTO_INCREMENT PRIMARY KEY,
                                 user_id INT,
                                 activity_type VARCHAR(50),
                                 activity_date DATETIME,
                                 details TEXT,
                                 FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE gift_codes (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            code VARCHAR(255) NOT NULL UNIQUE,
                            application_id INT,
                            valid_from DATE,
                            valid_until DATE,
                            used_by INT,
                            use_date DATETIME,
                            FOREIGN KEY (application_id) REFERENCES applications(id),
                            FOREIGN KEY (used_by) REFERENCES users(id)
);
