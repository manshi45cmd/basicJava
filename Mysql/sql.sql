create database DEPARTMENT;
use DEPARTMENT;
create table dept( id int primary key,
dept_name varchar(20));

create table teachers (
teacter_id int primary key ,
name varchar(20),dept_id int,
foreign key (dept_id) references  dept(id)
 );
insert into dept (id , dept_name)  values
(101, "Hindi",
102 , "English",
103 , "Science",
104 , "Math"
);

insert into teachers (teacter_id , name,dept_id)
values( 1, "Chaya",101,
 2,"Mona",103 ,
 3, "Rajeev" , 104,
4, "neelam" , 102
);

 