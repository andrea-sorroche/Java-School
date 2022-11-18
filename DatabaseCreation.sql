CREATE SCHEMA `railway` ;
USE railway;
CREATE TABLE station (
	id INT NOT NULL AUTO_INCREMENT,
    station_name VARCHAR(150),
    PRIMARY KEY (id)
);
CREATE TABLE train (
	id INT NOT NULL AUTO_INCREMENT,
    train_number VARCHAR(150) NOT NULL UNIQUE,
    seats INT NOT NULL,
    canceled BOOLEAN,
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
	id INT NOT NULL AUTO_INCREMENT,
	station_id INT,
    train_id INT,
    time TIME,
    PRIMARY KEY (id),
    FOREIGN KEY (station_id)
        REFERENCES station(id),
    FOREIGN KEY (train_id)
        REFERENCES train(id)
);
CREATE TABLE route (
	id INT NOT NULL AUTO_INCREMENT,
	train_number VARCHAR(150),
    segment VARCHAR(150),
    PRIMARY KEY (id),
    FOREIGN KEY (train_number)
        REFERENCES train(train_number)
);
CREATE TABLE segment (
	id INT NOT NULL AUTO_INCREMENT,
    source_id INT,
    destination_id INT,
    distance INT,
    duration TIME,
    PRIMARY KEY (id),
    FOREIGN KEY (source_id)
        REFERENCES station(id),
	FOREIGN KEY (destination_id)
        REFERENCES station(id)
);


