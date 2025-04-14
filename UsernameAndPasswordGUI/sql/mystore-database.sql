-- CREATE DATABASE mystore;
-- USE mystore;
-- DROP DATABASE mystore;


CREATE TABLE IF NOT EXISTS users (
	userid INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(200) NOT NULL,
    email VARCHAR(200) NOT NULL UNIQUE,
    phone VARCHAR(200),
    address VARCHAR(200),
    password VARCHAR(200) NOT NULL);
    
    
INSERT INTO users (userid, name, email, phone, address, password)
    VALUES (NULL, 'admin', 'admin@gmail.com', '+1234567890', 'New York, USA', 'password01');

INSERT INTO users (userid, name, email, phone, address, password)
    VALUES (NULL, 'dulce', 'dulcebaconawa@gmail.com', '+15613171571', 'Florida, USA', 'password01');