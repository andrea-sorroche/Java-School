USE railway;
INSERT INTO user VALUES (1,'andrea', 'password');

INSERT INTO role VALUES (1,'user');

INSERT INTO user_role VALUES (1,1,1);

INSERT INTO route VALUES (1);

INSERT INTO train VALUES (1,0,100,'09:00',1,1);
INSERT INTO train VALUES (2,0,150,'12:00',2,1);

INSERT INTO passenger VALUES (1,'1997-10-23', 'andrea@tsystems.com','Andrea','Sorroche' , '666666666');

INSERT INTO station VALUES (1,0,'Barcelona', '00:30');
INSERT INTO station VALUES (2,0,'Madrid', '00:30');
INSERT INTO station VALUES (3,0,'Malaga', '00:30');

INSERT INTO route_part VALUES (1,10,"09:00",1, 2);
INSERT INTO route_part VALUES (2,30,"11:00",2, 3);
INSERT INTO route_part VALUES (1,10,"12:00",1, 2);
INSERT INTO route_part VALUES (2,30,"14:00",2, 3);

INSERT INTO route_connection VALUES (1,1,1);
INSERT INTO route_connection VALUES (2,1,2);



