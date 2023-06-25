INSERT INTO
    application_user (first_name, last_name, email, password)
VALUES
    -- admin@example.com / hard
    ('Jan', 'Nowak', 'admin@example.com', '{bcrypt}$2a$10$PjN52WoUJJR5Ql2vy/wJSenhfuz4dNd5G2sGsZrdSF1kQ7dKXq4tC'),
    -- john@example.com / john
    ('Timi', 'Jimi', 'john@example.com', '{MD5}{5wuYZHQU3QKHMkuEBJwKHnW5k4EYdpggkC44QNVBgYk=}33fdbb83383ac6df4884b5bc94725746'),
    -- kicek@example.com / lucek
    ('Jares', 'Palecka', 'kicek@example.com', '{argon2}$argon2id$v=19$m=16384,t=2,p=1$2BFW7Ztk4EalMZfUN9VWdQ$ACV2at2xpF5yb1dYFlOMxC05KG5v0EV/KCehX4uAaSI');

INSERT INTO
    user_role (name, description)
VALUES
    ('ADMIN', 'Ma dostęp do wszystkiego'),
    ('USER', 'Dostęp tylko do odczytu');

INSERT INTO
    user_roles (user_id, role_id)
VALUES
    (1, 1),
    (2, 2),
    (3, 2);