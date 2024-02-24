INSERT INTO applications (name, description, publisher, category, price, image_url, release_date)
VALUES
    ('App One', 'Description for App One.', 'Publisher One', 'Games', 1.99, 'http://example.com/app-one.png', '2023-02-01'),
    ('App Two', 'Description for App Two.', 'Publisher Two', 'Education', 2.99, 'http://example.com/app-two.png', '2023-03-01');

INSERT INTO version_histories (application_id, version, release_date, update_info)
VALUES (1, '1.0', '2024-02-21', 'Initial release with full features.');

INSERT INTO reviews (application_id, user_id, comment, rating, comment_date)
VALUES (1, 1, 'This app is amazing! It has everything I need.', 5, '2024-02-22');

INSERT INTO purchase_records (user_id, application_id, purchase_date)
VALUES (1, 1, '2024-02-23');
