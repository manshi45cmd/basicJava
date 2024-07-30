create database company ;

use  company;

create table employee( id int  primary key , name varchar(20), salary double  default 25000);
 
insert into employee 
( id , name , salary )
values 
(1 ,"adam", 25000),
(2,"bob", 300000), 
(3, "casey", 400000);

insert into employee values ( 11, "Joy" ,00);
select * from employee;

create table temp1( id int , name varchar(20), city varchar(20),  primary key ( id ,name ) );

create table emp1( id int , salary int default 25000);

insert into   emp1 (id)  values ( 111);
select* from emp1;
create table person ( age int check (age  >= 18), name varchar(20));
insert into person (age, name ) values (23, "nehs"),
(21 , "ram"),
(33, "shyamlal");

