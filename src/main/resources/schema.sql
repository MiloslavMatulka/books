DROP SCHEMA IF EXISTS book_dev;
CREATE SCHEMA book_dev;
USE book_dev;

DROP TABLE IF EXISTS it;
CREATE TABLE it (
    id bigint NOT NULL AUTO_INCREMENT,
    author varchar(45) NOT NULL,
    name varchar(100) NOT NULL,
    price decimal(10,0) DEFAULT NULL,
    PRIMARY KEY (id)
);
