package SQL;


create database Study;
use study;
create table learners(eno int primary key auto_Increment,learnername varchar(255), age int, course_name varchar(255), gender char);
insert into learners values(1,'shalu',22, 'software developement','F');
insert into learners values(2,'pawan',22,'software developement','M');
insert into learners(learnername, age, course_name, gender) values('Amir',48, 'Java','M');
insert into learners(learnername, age, course_name, gender) values('Shimla',28, 'C','F');
insert into learners(learnername, age, course_name, gender) values('Shabakshant',24, 'Quantum','M');
insert into learners(learnername, age, course_name, gender) values('Shivprakash',32, 'Java','M');
insert into learners(learnername, age, course_name, gender) values('jenny',22, 'Java','F');

select * from learners;
select gender, count(*) from learners group by gender;
select learnername, age from learners where age between 22 and 30;
select learnername, age from learners where age>32;
update learners set learnername = 'Shila' where eno = 4;
update learners set age = 30 where eno = 3;
select * from learners;
select course_name , count(*) from learners group by course_name;
select gender,sum(age) As totalage from learners where age > 25 group by gender;
select * from learners;
---------------------------------------------------------------------------------------------------------------
use Study;
create table employee(eid int primary key ,emp_name varchar(255), department varchar(255),salary numeric);
insert into employee values (101,'Shalu','Comps',60000);
insert into employee values (102,'Pawan','Comps',40000);
insert into employee values (103,'Ankita','IT',50000);
insert into employee values (104,'Shri','HR',30000);
insert into employee values (105,'Omdi','CSE',35000);

select department,count(*) from employee where salary>30000 group by department;
SELECT emp_name, salary 
FROM employee 
WHERE salary = (SELECT MAX(salary) FROM employee);   
---------------------------------------------------------------------------------------------------------------
create table student(studid int primary key, sname varchar(255), age int, course_name varchar(255));
insert into student values (101,'Shalu',25,'Comps');
insert into student values (102,'Pawan',22,'Comps');
insert into student values (103,'Ankita',21,'IT');
insert into student values (104,'Shri',20,'HR');
insert into student values (105,'Omdi',19,'CSE');
create table assessment(assid int primary key, aname varchar(255), status varchar(255), expirydate varchar(255));
Alter table assessment add coloumn studentid int;
select * from assessment;
insert into assessment values(1001, 'ELAT','active','22/4/2026',101);
insert into assessment values(1002, 'MLAT','expire','18/2/2026',102);
insert into assessment values(1003, 'MLAT','active','20/4/2026',103);
insert into assessment values(1004, 'EXLAT','active','30/4/2026',104);
insert into assessment values(1005, 'ELAT','expire','1/3/2026',105);

select sname, aname,course_name, status from student inner join assessment on student.studid = assessment.studentid;
---------------------------------------------------------------------------------------------------------------
 create database tables;
 use tables;
 create table student (sid int primary key,sname varchar(255),c_id int ,gender char);
 create table course (c_id int primary key,c_name varchar(255),fees int );
 insert into student values(101,'ankit',10,'m');
  insert into student values(102,'ankita',11,'f');
 insert into student values(103,'shalu',12,'f');
 insert into student values(104,'pawan',13,'m');
 insert into student values(105,'shital',null,'f');
 
 select * from student;
 insert into course values(10,'java',10000);
 insert into course values(11,'c',15000);
 insert into course values(12,'sql',10000);
 insert into course values(13,'python',10500);
 insert into course values(14,'c++',10000);
  select sname,c_name from student inner join course on student.c_id=course.c_id;
  
  select sname from student where c_id is null;
  select gender ,count(*) from student group by gender;
  select sname,c_name,gender from student inner join course on student.c_id=course.c_id order by sname desc;
  select sname,c_name from student left join course on student.c_id=course.c_id;
   select sname,c_name from student right join course on student.c_id=course.c_id;
    select sname,c_name from student left join course on student.c_id=course.c_id;
   select sname,c_name from student right join course on student.c_id=course.c_id union select sname,c_name from student left join course on student.c_id=course.c_id;


 
    

