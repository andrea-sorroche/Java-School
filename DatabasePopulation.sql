USE railway;
INSERT INTO user(id,login,password) VALUES (1,'andrea', 'password');

INSERT INTO role(id,name) VALUES (1,'user');

INSERT INTO user_role(id, role_id, user_id) VALUES (1,1,1);

INSERT INTO route(id) VALUES (1);
INSERT INTO route(id) VALUES (2);

INSERT INTO train(id,cancelled,count_of_seats, departure_time, number, route_id) VALUES (1,0,100,'09:00',1,1);
INSERT INTO train(id,cancelled,count_of_seats, departure_time, number, route_id) VALUES (2,0,150,'12:00',2,1);
INSERT INTO train(id,cancelled,count_of_seats, departure_time, number, route_id) VALUES (3,0,70,'16:00',3,2);

INSERT INTO passenger(id,birth_date,email,first_name,last_name,mobile_phone) VALUES (1,'1997-10-23', 'andrea@tsystems.com','Andrea','Sorroche' , '666666666');

INSERT INTO station(id,closed,name,stop_duration) VALUES (1,0,'Barcelona', '00:30');
INSERT INTO station(id,closed,name,stop_duration) VALUES (2,0,'Madrid', '00:30');
INSERT INTO station(id,closed,name,stop_duration) VALUES (3,0,'Malaga', '00:30');
INSERT INTO station(id,closed,name,stop_duration) VALUES (4,0,'Sevilla', '00:20');
INSERT INTO station(id,closed,name,stop_duration) VALUES (5,0,'Cordoba', '00:15');

INSERT INTO route_part(id,price,time_passing,station_from,station_to) VALUES (1,10,"09:00",1, 2);
INSERT INTO route_part(id,price,time_passing,station_from,station_to) VALUES (2,30,"11:00",2, 3);
INSERT INTO route_part(id,price,time_passing,station_from,station_to) VALUES (3,10,"12:00",1, 2);
INSERT INTO route_part(id,price,time_passing,station_from,station_to) VALUES (4,30,"14:00",2, 3);
INSERT INTO route_part(id,price,time_passing,station_from,station_to) VALUES (5,20,"16:00",4, 5);

INSERT INTO route_connection(id, route_id, route_part_id) VALUES (1,1,1);
INSERT INTO route_connection(id, route_id, route_part_id) VALUES (2,1,2);



