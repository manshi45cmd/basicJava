create database college;
create database if not exists college; 
drop database if exists student;
 drop database  college;
use   college ;

create table Student1( 
id int  primary key, 
name varchar(30), 
age int  not null);

insert into Student1 values ( 1, 'Aman', 26);
insert into Student1 values ( 2, 'neha', 24);
select * from Student1;
select name from student1 where name = 'A%';
show databases;
show tables;