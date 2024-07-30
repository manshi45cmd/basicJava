create database joinn;
use joinn;
create table coustomer( 
 ID int   auto_increment,
name varchar(30) not null,
city varchar(30));

create table product ( product_id int , coutomer_id int  ,
 product_name varchar(40) not null  ,  foreign key(coutomer_id)
 references coustomer(ID));
   

desc coustomer;
desc product;

insert into coustomer values( 12, "Rakesh" ,"Indore");
insert into coustomer (name, city) values ("shivani " , " Bhopal");
insert into  product values(12121 , 12 , "charger_Iphone");
insert into  product values(12291 , 12 , " TV");
insert into  product values( 4558 , 12 , "laptop");
insert into  product values( 67451 , 13 , " Book");
insert into  product values (7896 , 13 , " flower ");





