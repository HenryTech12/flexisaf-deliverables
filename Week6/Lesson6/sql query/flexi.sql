/* CREATE DATABASE FLEXI SQL QUERY */
create database flexi;
USE flexi;

/* CREATE TABLE USERS SQL QUERY */
create table users(
	id INT PRIMARY KEY,
    firstname varchar(25),
    lastname varchar(25),
    address varchar(50),
    occupation varchar(100),
    flexi_date DATE
);

/* insert into table */
insert into users
 values(1,'Henry',
 'Fakorode',
 'University Of Lagos',
 'Backend Java Developer',
 '2017-10-5');

insert into users
 values(2,'John',
 'Doe',
 'Mainland Street',
 'Student',
 '2023-2-15');
 
 /* view inserted values */
 select * from users u;

/*update table column */
alter table users
change column firstname first_name varchar(25);
alter table users
change column lastname last_name varchar(25);

select * from users; /* show column changes */

/* update table column values */
update users
set first_name = 'Mark' where id = 1;

update users
set last_name = 'Harry' where id = 2;

select * from users; /* show updated values */

/* delete from table*/
delete from users
where id = 1;

/* view changes */
select * from users;

/* delete column*/
alter table users
drop column first_name;
alter table users
drop column last_name;

/* view changes */
select * from users;

/* DELETE TABLE */
drop table users;

/* DELETE DATABASE */
drop database flexi;