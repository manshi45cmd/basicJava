create database college2;
use college2;
drop database college2;
create table Studentt2 ( rollno int primary key , name varchar(50), marks int not null , gread varchar(2), city varchar(20));

insert into Studentt2  ( rollno , name , marks , gread , city )

 
 values
  (101 , "nail", 78 , "C", "Pune"),
  (102 ,"kunal" ,93 ,"A","Mumbai"),
  (103 ,"chetan" ,85 ,"B","Mumbai"),
 (104 ,"dhurb" ,96 ,"A","Delhi"),
   (105 ,"bhumika" ,23 ,"F"," Pune"),
     (106 ," neha" ,97 ,"A","Mumbai");
     
     select name from studentt2;
     -- Aggregate Functions  ----->  Aggregate Functions perfrom a calulation on a set of values , and return a single value 
     select MAX(marks)  
     from studentt2 ;
      select min(marks)  
     from studentt2 ;
      select avg(marks)  
     from studentt2 ;
      select count ( rollno)  
     from studentt2 ;
     
      --  que.1 write the query to find avg marks in each city in ascending order . 
      select city ,Avg(marks)   
      from studentt2 
      group by city 
      order by  avg (marks) desc;  -- by defaukt Ascending order 
      
      select gread ,count(rollno)
      from Studentt2 
      group by gread;
      --  having clause ---> similar to where i.e. applies some condition on rows.
      --  used when we went to apply any condition after grouping .
       --  que  count number of students in each city where max marks cross 90.alter
       select city , count(rollno)
       from studentt2 
        group by city
         having max(marks) >90;
       
      select city
      from studentt2
      where gread = "A"
      group by city 
      having max(marks)>=93
      order by city ASC ;
       
       set SQL_SAFE_UPDATE =0;
       update stydentt2 
       set gread = "o"
       where graed = "A";
       
       update studentt2 
       set marks = 82
       where rollno = 105;
       
       delete from studentt2
       where marks <33
     
       
       
       select * from studentt2;
       
       
       
     