CREATE SCHEMA `railway` ;
USE railway;
CREATE TABLE station (
	id INT NOT NULL AUTO_INCREMENT,
    station_name VARCHAR(150),
    PRIMARY KEY (id)
);
CREATE TABLE train (
	id INT NOT NULL AUTO_INCREMENT,
    train_number VARCHAR(150) NOT NULL,
    seats INT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE passenger (
	id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(150) NOT NULL,
    surname VARCHAR(150) NOT NULL,
    birthday DATE NOT NULL,
    PRIMARY KEY (id)
);
CREATE TABLE ticket (
	id INT NOT NULL AUTO_INCREMENT,
    passenger_id INT,
    train_id INT,
    FOREIGN KEY (passenger_id)
        REFERENCES passenger(id),
    FOREIGN KEY (train_id)
        REFERENCES train(id),
    PRIMARY KEY (id)
);
CREATE TABLE schedule (
	station_id INT,
    train_id INT,
    time TIME,
    FOREIGN KEY (station_id)
        REFERENCES station(id),
    FOREIGN KEY (train_id)
        REFERENCES train(id)
);


