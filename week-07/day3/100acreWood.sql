CREATE DATABASE hundred_acre_wood;
SET SQL_SAFE_UPDATES = 0;
SHOW DATABASES;
USE hundred_acre_wood;
CREATE TABLE inhabitants (
	id INT auto_increment PRIMARY KEY NOT NULL,
    name VARCHAR(30) NOT NULL,
    gender ENUM("F", "M"),
    age TINYINT UNSIGNED
    );
SHOW TABLES;

INSERT INTO inhabitants VALUES(null, "Micimacko", "M", 6);
SELECT *FROM inhabitants;
INSERT INTO inhabitants VALUES(NULL, "Fules", NULL, 30);
INSERT INTO inhabitants VALUES(NULL, "Tigris", "M", null);
UPDATE inhabitants
	SET age = 5
    WHERE name = 'Tigris';
SELECT * FROM inhabitants;

ALTER TABLE inhabitants CHANGE age inhabitant_age varchar(10);
SELECT * FROM inhabitants;




