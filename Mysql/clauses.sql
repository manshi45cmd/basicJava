create database college;
use college;
create table Studentt ( rollno int primary key , name varchar(50), marks int not null , gread varchar(2), city varchar(20));

insert into Studentt  ( rollno , name , marks , gread , city )
 values
  (101 , "nail", 78 , "C", "Pune"),
  (102 ,"kunal" ,93 ,"A","Mumbai"),
  (103 ,"chetan" ,85 ,"B","Mumbai"),
 (104 ,"dhurb" ,96 ,"A","Delhi"),
   (105 ,"bhumika" ,23 ,"F"," Pune"),
     (106 ," neha" ,97 ,"A","Mumbai");
     
     select name from studentt;
      select * from Studentt;  -- for all data show 
      
      select distinct city from studentt; --  distinct  return unique values
      -- where clause ---> to define some conditions
      select * from Studentt where marks+10 > 100;
      select * from studentt where marks AND  city = "Mumbai";    --  ANd ( to check for both condition to be true )
       select * from studentt where marks OR  city = "Mumbai";     --  OR ( to check for one of the condition to be true )
        select * from studentt where marks  BETWEEN  80 AND 90;     --  between (selectgor a given range)
        select * from studentt where city IN ("delhi" , "Mumbai");    --  IN ( matches any value in the list)
         select * from studentt where city NOT IN ("delhi" , "Mumbai");   --  NOT ( to negate the given condition)
         
         --  LIMITE CLAUSE ----> Sets upper limit on number of (tuples) rows to be returned 
         select* from studentt 
         where marks >75 limit 2;
         select* from studentt  limit 3;
         
          -- Order by clause ----> to sort in ascending (ASC) or descending order (DESC)
          select* from studentt  ORDER BY city  ASC;
      select* from studentt order by marks desc  limit 3;
      select* from studentt order by marks desc  ;
      select marks from studentt   marks  = max(marks)  ;
      select* from studentt order by marks desc  limit 1 offset 2;
      select* from studentt ;
      
      --  GROUP BY CLAUSE  ----> groups rows that have the same values into summary rows . 
      -- it collects data from multiple records and groups the result by one or more column.
      --  generally we use group by with some aggregation function. 
      select city , count (name) 
      from studentt 
      GROUP BY city;
      