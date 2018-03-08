




________________________________________

Este proyecto necesita 3 tablas en localhost :

el hash del password se ha generado con BCrypt Calculator Generator(https://www.dailycred.com/article/bcrypt-calculator)

hay 2 usuarios : user:123 y admin:123

ejecutalo ( mvn spring-boot:run ) y podras acceder a localhost:8080
________________________________________

para funcionar necesita 3 tablas con algunos datos dentro en bbdd :
________________________________________

CREATE TABLE sys_users (
ID INT ,
username TEXT (25) ,
password TEXT (200) ,
email TEXT (25) ,
banned BOOLEAN ,
name TEXT (25) ,
surname TEXT (25) ,
modified timestamp ,
created timestamp
);

CREATE TABLE sys_authority (
id INT ,
name TEXT (25)
);

CREATE TABLE USER_AUTHORITY (
user_id INT ,
authority_id INT
);
________________________________________

INSERT INTO sys_users (ID, username, password, email, banned,
name, surname, modified, created)
 VALUES (1, 'user', '$2a$04$Vbug2lwwJGrvUXTj6z7ff.97IzVBkrJ1XfApfGNl.Z695zqcnPYra',
 'user@example.com', false, 'juan', 'lopez', '2017-10-01 21:58:58.50807', '2017-10-01 21:58:58.50807');

INSERT INTO sys_users (ID, username, password, email, banned,
 name, surname, modified, created)
 VALUES (2, 'admin', '$2a$04$Vbug2lwwJGrvUXTj6z7ff.97IzVBkrJ1XfApfGNl.Z695zqcnPYra',
 'admin@example.com', false, 'pepe', 'sanchez', '2017-10-01 21:58:58.50807', '2017-10-01 21:58:58.50807');

INSERT INTO sys_authority (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO sys_authority (id, name) VALUES (2, 'ROLE_ADMIN');

INSERT INTO USER_AUTHORITY (user_id, authority_id) VALUES (1, 1);
INSERT INTO USER_AUTHORITY (user_id, authority_id) VALUES (2, 1);
INSERT INTO USER_AUTHORITY (user_id, authority_id) VALUES (2, 2);
________________________________________
