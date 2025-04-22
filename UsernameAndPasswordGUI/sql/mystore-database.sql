CREATE DATABASE mystore;
USE mystore;

-- DROP Tables for mystore to clear them.
DROP TABLE IF EXISTS payroll;
DROP TABLE IF EXISTS timesheets;
DROP TABLE IF EXISTS users;



CREATE TABLE IF NOT EXISTS users (
	userid INT(7) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(200) NOT NULL,
    email VARCHAR(200) NOT NULL UNIQUE,
    phone VARCHAR(200),
    address VARCHAR(200),
    password VARCHAR(200) NOT NULL
);



CREATE TABLE salaries (
    salaryId INT AUTO_INCREMENT PRIMARY KEY,
    userId INT NOT NULL,
    payType ENUM('hourly', 'salary') NOT NULL DEFAULT 'hourly',
    payRate DECIMAL(10,2) NOT NULL,
    effectiveDate DATE NOT NULL,
    FOREIGN KEY (userId) REFERENCES users(userId) on DELETE CASCADE
);


CREATE TABLE timesheets (
    timesheetId INT AUTO_INCREMENT PRIMARY KEY,
    userId INT NOT NULL,
    clockIn DATETIME NOT NULL,
    clockOut DATETIME,
    notes TEXT,
    FOREIGN KEY (userId) REFERENCES user(userId) ON DELETE CASCADE
);


INSERT INTO users (userid, username, email, phone, address, password)
    VALUES (0000001, 'admin', 'admin@gmail.com', '+1234567890', 'New York, USA', 'password01');
INSERT INTO users (userid, username, email, phone, address, password)
    VALUES (3171245, 'dulce', 'dulcebaconawa@gmail.com', '+15613171571', 'Florida, USA', 'password01');