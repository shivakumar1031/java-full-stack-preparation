-- NORMALIZED TABLE EMPLOYEES IT IS DEPENDENT TABLE AND INDEPENDENT TABLES MANAGER,STATE AND DEPARTMENT
use palle;
CREATE TABLE Department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50) UNIQUE
);

CREATE TABLE Manager (
    manager_id INT PRIMARY KEY,
    manager_name VARCHAR(50)
);

CREATE TABLE State (
    state_id INT PRIMARY KEY,
    state_name VARCHAR(50) UNIQUE
);

CREATE TABLE Employees (
    e_id INT PRIMARY KEY,
    fname VARCHAR(50),
    lname VARCHAR(50),
    age INT,
    salary DECIMAL(10,2),
    dept_id INT,
    manager_id INT,
    state_id INT,

    FOREIGN KEY (dept_id) REFERENCES Department(dept_id),
    FOREIGN KEY (manager_id) REFERENCES Manager(manager_id),
    FOREIGN KEY (state_id) REFERENCES State(state_id)
);


INSERT INTO Department (dept_id, dept_name) VALUES
(1, 'IT'),
(2, 'HR'),
(3, 'Finance'),
(4, 'Sales'),
(5, 'Marketing');

INSERT INTO Manager (manager_id, manager_name) VALUES
(101, 'Ravi'),
(102, 'Priya'),
(103, 'Kiran'),
(104, 'Anitha'),
(105, 'Suresh');

INSERT INTO State (state_id, state_name) VALUES
(1, 'Karnataka'),
(2, 'Tamil Nadu'),
(3, 'Andhra Pradesh'),
(4, 'Telangana'),
(5, 'Kerala');

INSERT INTO Employees
(e_id, fname, lname, age, salary, dept_id, manager_id, state_id)
VALUES
(1,  'Shiva',   'Kumar',    23, 45000, 1, 101, 1),
(2,  'Rahul',   'Reddy',    27, 65000, 1, 101, 3),
(3,  'Priya',   'Sharma',  29, 75000, 1, 102, 1),
(4,  'Arjun',   'Rao',      25, 55000, 2, 102, 4),
(5,  'Sneha',   'Patel',    31, 80000, 2, 102, 1),
(6,  'Kiran',   'Kumar',    28, 60000, 3, 103, 2),
(7,  'Anjali',  'Reddy',    26, 70000, 3, 103, 3),
(8,  'Vikram',  'Singh',    35, 95000, 3, 103, 1),
(9,  'Meena',   'Rao',      24, 40000, 4, 104, 5),
(10, 'Rohit',   'Sharma',  30, 85000, 4, 104, 3),
(11, 'Pooja',   'Patel',    27, 50000, 4, 104, 1),
(12, 'Suresh',  'Reddy',    40, 100000, 5, 105, 4),
(13, 'Divya',   'Kumar',    29, 72000, 5, 105, 2),
(14, 'Manoj',   'Rao',      33, 68000, 5, 105, 3),
(15, 'Neha',    'Singh',    22, 35000, 1, 101, 2),
(16, 'Neha',    'Singh',    25, 35000, 1, 101, 2);

insert into employees values(16,'Neha', 'Singh',24,3500,1,101,2);
update employees set age = 24 where e_id=16;

select * from employees;
select * from department;
select * from manager;
select * from state;


-- W.A.Q means Write a Query;
-- 1. W.A.Q display youngest employee details from 'sales' department
	select e.*, d.dept_name as dept_name from employees e 
    join department d on e.dept_id=d.dept_id 
    where age=(
				select min(age) from employees e1
				join department d1 on e1.dept_id=d1.dept_id
				where d1.dept_name='Sales'
			  ) 
              and d.dept_name='Sales';
              
-- 2. W.A.Q to display employee details who has manager
	select e.*,m.manager_name from employees e join manager m on e.manager_id=m.manager_id;
    
-- 3. W.A.Q to display youngest and eldest employee fname in the same table
	select (select fname from employees where age=(select min(age) from employees)) as youngest,
           (select fname from employees where age=(select max(age) from employees)) as eldest;
           
-- 4. W.A.Q to display max salary from each department
	select d.dept_name , max(salary) from employees e join department d on e.dept_id=d.dept_id
													   group by d.dept_name,e.dept_id;

-- 5. W.A.Q to display the dept with highest average salary
	select dept_name , Avg_salary  from
			(
			select d.dept_name,avg(e.salary) as Avg_salary from employees e 
			join department d on e.dept_id=d.dept_id
			group by d.dept_name,e.dept_id
            ) as dept_avg order by Avg_salary desc limit 1;
            
-- 6. W.A.Q to display dept with more than or equal to 5 employees
	select d.dept_name from employees e join department d on e.dept_id = d.dept_id 
								   group by d.dept_name,e.dept_id having count(e.e_id )>=5;
                                   
-- 7. W.A.Q to display 2nd highest salary getting employee details
	select * from employees order by salary desc limit 1,1; -- it will work only if table have distinct salaries
    select e1.* from employees e1 where 1 = (select count(*) from employees e2 where e1.salary<e2.salary); -- it will work only if table has distinct salaries
	select e1.* from employees e1 where 1 = (select count(distinct e2.salary) from employees e2 where e1.salary<e2.salary); -- it will work if table has duplicate salaries also
    select * from employees where salary=(select max(salary) from employees where salary< (select max(salary) from employees)); -- it will work if table has duplicate salaries also

-- 8. W.A.Q to display top paid employee details from each dept
	select e.*,d.dept_name from employees e join department d on e.dept_id=d.dept_id
							where salary =(select max(salary) from employees e2 where e.dept_id=e2.dept_id);

-- 9. W.A.Q to update all sales emplouee salary as 65000 if previous salary is less than 50000
	update employees e join department d on e.dept_id=d.dept_id set salary=65000 where salary<50000 and d.dept_name='Sales';
    
-- 10. W.A.Q to delete employees details when employee name same as manager name
	delete e from employees e join manager m on e.fname=m.manager_name;

-- 11. W.A.Q to delete youngest employee details from 'Sales' department
	delete e from employees e 
		join department d 
			on e.dept_id=d.dept_id 
					where age=(select min(age) from employees e2 
								join department d on e2.dept_id=d.dept_id 
									where d.dept_name='Sales') 
						and d.dept_name='Sales';
						
	delete from employees  where e_id =(
												select e1.e_id from employees e1 join department d 
                                                on d.dept_id=e1.dept_id where d.dept_name='Sales' 
                                                order by e1.age asc limit 1);
                        

							
-- 12. W.A.Q to display employee details who salary is greater than average salary of thier own department
	select e.*,d.dept_name from employees e 
			join department d on e.dept_id=d.dept_id
				where salary > (select avg(salary) from employees e1 where e1.dept_id=e.dept_id);
                                                       
	





