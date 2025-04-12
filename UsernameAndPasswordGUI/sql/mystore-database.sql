-- CREATE DATABASE mystore;


CREATE TABLE IF NOT EXISTS users (
	userid INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(200) NOT NULL,
    email VARCHAR(200) NOT NULL UNIQUE,
    phone VARCHAR(200),
    address VARCHAR(200),
    password VARCHAR(200) NOT NULL);
    
    
INSERT INTO 'users' ('userid', 'name, 'email', 'phone', 'address', 'password')
    VALUES ();