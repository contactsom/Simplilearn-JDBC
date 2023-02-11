show databases;

/*drop DATABASE simplilearn;*/

CREATE DATABASE simplilearn;

USE simplilearn;

create table Employees(
     id int NOT NULL PRIMARY KEY,
     age int NOT NULL,
     first varchar (255),
     last varchar (255)
     );
	
	
  drop table Employees;
    SELECT * FROM Employees;
    
INSERT INTO Employees VALUES (100, 21, 'JACK', 'EDITION');
INSERT INTO Employees VALUES (101, 22, 'RUSTY', 'COLTONS');
INSERT INTO Employees VALUES (102, 23, 'MOHAN', 'P');
INSERT INTO Employees VALUES (103, 24, 'PALANI', 'K');
INSERT INTO Employees VALUES (104, 25, 'SHRI', 'KANTA');
INSERT INTO Employees VALUES (105, 26, 'WILMAN', 'KALA');



 create table Student(
     Stu_id     int not null,
     Stu_FName  varchar (255) not null,
     Stu_LName  varchar (255),
     Stu_Marks  int
  );   
  
   INSERT INTO Student VALUES (201, 'Shivam', 'Tiwari', 90);
   INSERT INTO Student VALUES (202, 'Joe', 'Biden', 25);
   INSERT INTO Student VALUES (203, 'Suvin', 'Rohith', 56);
   INSERT INTO Student VALUES (204, 'Srivalli', 'Kamath', 80);  
   INSERT INTO Student VALUES (205, 'Robert', 'downey', 70);  
   
   select * from Student;
   
  
  select * from customers;
  
  create table customers(	
		cid int  PRIMARY KEY NOT NULL AUTO_INCREMENT,	 
		cname char(15),
		email char(15),
		phsone long,
		city char(15),
		bal double
		);


SELECT * FROM BOOK;



create table BOOK(
     BOOK_ID     int NOT NULL PRIMARY KEY,
     BOOK_NAME   varchar (255),
     BOOK_PRICE  int NOT NULL,
     BOOK_AUTHOR varchar (255)
     );
     
INSERT INTO BOOK  VALUE  (101, 'SQL in 10 Minutes', 500, 'Sams Teach');
     
     drop table customers;
select * from customers;

  create table customers(	
		cid int  PRIMARY KEY NOT NULL AUTO_INCREMENT,	 
		name char(15),
		email char(15),
		phone long,
		city char(15),
		bal double
		);
 
 USE simplilearn;
 select * from customers;
 drop table customers;

 
select * from students;
select * from courses;
select * from emails;
select * from marks;
select * from phones;
select * from refs;
     
drop table customers;
create table customers(	
		cid int  PRIMARY KEY NOT NULL AUTO_INCREMENT,	 
		cname char(15),
		email char(15),
		phone long,
		city char(15),
		status char(15)
	);
    
select * from customers;










