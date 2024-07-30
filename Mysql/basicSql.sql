 create database BasicMySql;
 use BasicMySql;
 create table student(student_Id int, s_name varchar(20), Address varchar(20));
 insert into student values(101,'manshi', 'bhopal');
 show  tables;
 
 desc Student ;
 
 insert into student values((102, 'neha','bhopal'),(321, 'rahuk','Indore'));
 insert into student (student_Id ,s_name ) values(2323, 'rakha');
 select* from student;
 select* from student where sudent_Id = 101 or Address = 'bhopal';
 
 create table Employee ( emp_id int  primary key, emp_name varchar(20),
 emp_salary double , emp_city varchar(25),emp_state varchar(23));
 desc Employee;
 insert into Employee ( emp_id , emp_name , emp_salary , emp_city, emp_state) values 
 (1,'Aman' , 20000 ,'Bhopal' , 'MP'),
 (2,'Vasu', 50000, 'Indore', 'MP'),
 (3, 'kunal',67000, 'Mumbai', 'MH'),
 (4, 'ankit', 450000 , 'Pune', 'MH');
 select*from Employee;
 
 drop database BasicMySql;
 
 
 