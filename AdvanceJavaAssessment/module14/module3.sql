USE assigment2;
USE assignment2;
CREATE TABLE employee(
 id  INT PRIMARY KEY NOT NULL ,
Ename VARCHAR(20),
Job VARCHAR(9),
Mgr INT(4) ,
Hiredate DATE,
Sal DECIMAL(7,2) ,
Comm DECIMAL(7,2) ,
Deptno INT(2)
);
INSERT INTO employee (id,Ename,Job,Mgr,Hiredate,Sal,Comm,Deptno)VALUES(1,"swathi","manager",2,2022/2/4,30000,8281452150,2);
INSERT INTO employee (id,Ename,Job,Mgr,Hiredate,Sal,Comm,Deptno)
VALUES(7369," SMITH", "CLERK" ,7902 ,1980-12-17, 800.00 ,4322222, 20);
INSERT INTO employee (id,Ename,Job,Mgr,Hiredate,Sal,Comm,Deptno)VALUES
(7499," ALLEN"," SALESMAN",7698, 1981-02-20, 1600.00 ,300.00, 30),
(7521," WARD"," SALESMAN",7698, 1981-02-22 ,1250.00 ,500.00, 30),
(7566 ,"JONES"," MANAGER",7839, 1981-04-02, 2975.00 ,(NULL), 20),
(7654 ,"MARTIN", "SALESMAN",7698 ,1981-09-28, 1250.00 ,1400.00, 30),
(7698 ,"BLAKE"," MANAGER",7839, 1981-05-01, 2850.00, (NULL), 30),
(7782, "CLARK", "MANAGER",7839, 1981-06-09, 2450.00, (NULL) ,10),
(7788," SCOTT"," ANALYST ",7566 ,1987-06-11, 3000.00 ,(NULL) ,20),
(7839," KING ","PRESIDENT",(NULL) ,1981-11-17, 5000.00, (NULL) ,10),
(7844, "TURNER", "SALESMAN",7698, 1981-08-09, 1500.00 ,0.00 ,30),
(7876," ADAMS ","CLERK", 7788 ,1987-07-13, 1100.00 ,(NULL) ,2);
INSERT INTO employee (id,Ename,Job,Mgr,Hiredate,Sal,Comm,Deptno)VALUES
(7900 ,"JAMES"," CLERK", 7698, 1981-03-12, 950.00 ,(NULL), 30 ),
(7902," FORD"," ANALYST", 7566 ,1981-03-12, 3000.00, (NULL), 20), 
(7934 ,"MILLER"," CLERK", 7782, 1982-01-23, 1300.00, (NULL), 1);
create table dept_table(
Deptno int(2) primary key not null,
Dname varchar(14),
Loc varchar(13) );
insert into dept_table(Deptno,Dname,Loc)values
(10," ACCOUNTING ","NEW YORK"),
(20," RESEARCH"," DALLAS"),
(30," SALES"," CHICAGO"),
(40," OPERATIONS"," BOSTON");
create table student_table(
Rno int(2) primary key not null,
Sname varchar(14),
City varchar(20),
State Varchar(20));
create table emp_log_table(
Emp_id int(5) primary key not null,
Log_date Date ,
New_salary Int(10),
Action Varchar(20));
 select distinct  job from employee;
 select *  from employee order by Deptno asc,job desc;
 select distinct job from employee order by job desc;
 update employee set Ename="SMITH"  where id=7369;
 SELECT Ename from employee where Hiredate<'1981-01-01';
 select id, Ename, Sal from employee where Mgr=7698;
 select * from employee where Comm>Sal;
 SELECT * FROM employee where job ="CLECK" OR job="ANALYST" order by job desc;
 select *  from employee where sal between 2000 and 3000;
 select * from employee where job="CLERK" AND Deptno=20;
 select Ename from employee where Ename like 's%'and length(Ename)=5;
 select * from employee where id not like '78%';
 select * from employee where Deptno=20 and job in (select job from employee where Deptno=10);
 select e1.* from employee e1,employee e2 where e1.Deptno=20 and e2.Deptno=10 and e1.job=e2.job;
 select * from employee e1 where e1.Sal in(select Sal from employee e2 where e2.Ename like "FORD" or e2.Ename=" SMITH") order by Sal desc;
 SELECT *from employee e1 where e1.Job in (select Job from employee e2 where e2.Ename="SMITH" or e2.Ename="ALLEN") ;
 SELECT e1.Job FROM employee e1 where e1.Deptno=10 and e1.Job not in(select e2.Job from employee e2 where e2.Deptno=20);
 select MAX(Sal) from employee ;
 select * from employee where Sal in(select  max(Sal) from employee);
 select Ename from employee where Ename like '%a%';
 select * from employee where Sal >(select Sal from employee where Ename="BLAKE");
 use assingment2;
 select * from employee where Sal in(select min(Sal) from employee group by Job)order by Sal;
 