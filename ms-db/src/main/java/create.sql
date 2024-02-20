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
