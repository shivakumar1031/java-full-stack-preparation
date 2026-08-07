-- FIRST WE SHOULD CREATE THE DATABASE
CREATE DATABASE PALLE;

-- THEN WE NEED SPECIFY THE DATABASE
use palle;

-- CREATING THE TABLES 

-- creating departments table
create table departments
(
    id int primary key,
    dept_name varchar(50)

);

-- INSERTING VALUES INTO THE TABLE 
insert into departments values (1,'Engineering'),(2,'Marketing'),(3,'HR'),(4,'Finance'),(5,'Legal');

-- TO DISPLAY THE RECORDS PRESENT IN THE TABLE 
SELECT * FROM departments;

-- CREATING EMPLOYEES TABLE
create table employees
(
    id int,
    name varchar(50),
    age int,
    email varchar(50),
    salary int,
    dept_id int,
    join_date date
);

-- INSERTING VALUES INTO EMPLOYEES TABLE
insert into employees values (1,'Rahul Sharma',25,'rahul@company.com',55000,1,'2023-01-15'),
                             (2,'Priya Singh',28,'priya@company.com',62000,1,'2022-06-20'),
                             (3,'Amit Kumar',22,'amit@company.com',48000,2,'2023-09-10'),
                             (4, 'Sneha Reddy',30,'sneha@company.com',70000,3 ,'2021-03-05'),
                             (5, 'Vikram Rao',35, 'vikram@company.com',85000 ,4 ,'2020-11-30'),
                             (6, 'Anjali Mehta',26 ,'anjali@company.com',58000, 2, '2023-04-18'),
                             (7, 'Karan Malhotra',40, 'karan@company.com',95000 ,1, '2019-07-22'),
                             (8, 'Divya Iyer',24, 'divya@company.com',51000, NULL, '2024-01-10');

-- DISPLAY THE RECORDS IN EMPLOYEES TABLE
select * from employees;