CREATE SCHEMA `railway` ;
USE railway;
CREATE TABLE user (
	id INT NOT NULL AUTO_INCREMENT,
    login VARCHAR(50),
    passwork VARCHAR(50),
    PRIMARY KEY (id)
);
CREATE TABLE role (
	id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50),
    PRIMARY KEY (id)
);
CREATE TABLE user_role (
	id INT NOT NULL AUTO_INCREMENT,
    user_id INT,
    role_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id)
        REFERENCES user(id),
	FOREIGN KEY (role_id)
        REFERENCES role(id)
);

CREATE TABLE passenger (
	id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    birth_date DATE,
    mobile_phone VARCHAR(50),
    email VARCHAR(50),
    PRIMARY KEY (id)
);
CREATE TABLE route (
	id INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (id)
);
CREATE TABLE train (
	id INT NOT NULL AUTO_INCREMENT,
    number VARCHAR(50),
    count_of_seats INT,
    cancelled BOOLEAN,
    route_id INT,
    departure_time TIME,
    PRIMARY KEY (id),
    FOREIGN KEY (route_id)
        REFERENCES route(id)
);
CREATE TABLE ticket (
	id INT NOT NULL AUTO_INCREMENT,
    passenger_id INT,
    train_id INT,
    departure_date TIME,
    FOREIGN KEY (passenger_id)
        REFERENCES passenger(id),
    FOREIGN KEY (train_id)
        REFERENCES train(id),
    PRIMARY KEY (id)
);
CREATE TABLE user_ticket (
	id INT NOT NULL AUTO_INCREMENT,
    user_id INT,
    ticket_id INT,
    payment_time TIME,
    FOREIGN KEY (user_id)
        REFERENCES user(id),
    FOREIGN KEY (ticket_id)
        REFERENCES ticket(id),
    PRIMARY KEY (id)
);
CREATE TABLE station (
	id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50),
    stop_duration TIME,
    closed BOOLEAN,
    PRIMARY KEY (id)
);
CREATE TABLE route_part (
	id INT NOT NULL AUTO_INCREMENT,
    station_from INT,
    station_to INT,
    price DOUBLE,
    time_passing TIME,
    PRIMARY KEY (id),
    FOREIGN KEY (station_from)
        REFERENCES station(id),
    FOREIGN KEY (station_to)
        REFERENCES station(id)
);
CREATE TABLE route_connection (
	id INT NOT NULL AUTO_INCREMENT,
    route_part_id INT,
    route_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (route_part_id)
        REFERENCES route_part(id),
    FOREIGN KEY (route_id)
        REFERENCES route(id)
);
