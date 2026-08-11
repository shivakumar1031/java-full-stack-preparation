create database palle;
use palle;

create table Employee
(
	eid int,
    fname varchar(50),
    lname varchar(50),
    age int ,
    salary int,
    dept varchar(50),
    doj date
);

insert into Employee values (1,'rajeev','sukla',23,12000,'.net','2011-10-23'),
							(2,'sowmya','kumari',23,19000,'db','2010-11-13'),
                            (3,'kishore','kumar',27,36000,'android','2011-10-16'),
                            (4,'abimanyu','biswal',22,null,'android','2010-02-20'),
                            (5,'soni','kumar',24,21800,'.net','2009-06-21'),
                            (6,'anu','_singh',22,12000,'db','2010-10-23'),
                            (7,'_dinesh','moh%anty',23,15000,'.net','2009-08-26'),
                            (8,'nishala','_kumari',22,18000,'db','2008-07-19'),
                            (1,'rajeev','sukla',23,12000,'.net','2011-10-23');
                            
select * from Employee;

create table Patient
(
	pid int,
    fname varchar(50),
    lname varchar(50),
    age int,
    bg varchar(50)
);

insert into Patient values (1,'madhava','reddy',45,'o+ve'),
							(2,'abhinav','bandra',45,'o-ve'),
                            (4,'hari','kiran',60,'b-ve'),
                            (3,'madhava','kiran',52,'o+ve'),
                            (5,'veena','kumari',42,null),
                            (6,'k_iran','kumar',39,'b-ve'),
                            (2,'abhinav','bandra',45,'o-ve'),
                            (7,'mahes%h','nambootri',36,'b+ve'),
                            (8,'rahul','kumar',46,'b-ve'),
                            (9,'bharat','kumar',56,'b-ve');
                            
                            
select * from Patient;

select avg(age), sum(age), min(age), max(age) from Patient;

select fname as youngest from Patient where age=(select min(age) from Patient)
union
select fname as eldest from Patient where age = (select max(age) from Patient);

select fname from Patient where age=avg(age);

-- SHOWING TABLES AND DATABASES:
		show tables ;
		show databases;

/*---------------------------------------------------------------------*/

-- 05 aug 2026
# 6:34

# AGGREGATE FUNCTIONS
	
	# ALL AGGREGATE FUNCTIONS
		select min(age),max(age),sum(age),avg(age),count(age) from Patient;
        -- COUNT(*) and COUNT(1)
			-- > COUNT(*) counts every row, even if the entire row is NULL, 
            -- > while COUNT(1) also counts every row because 1 is non-NULL for each row.
			select count(*) from Patient;
            select count(1) from Patient;
            
	-- assignment
	#STORING MAX AGE FNAME AND MIN AGE FNAME IN VARIABLE BY USING ORDER BY AND LIMIT THEN DISPLAYING IT
		set @x=(select fname from Patient order by age desc limit 1); 
		set @y=(select fname from Patient order by age asc limit 1);

	# STORING MAX AGE FNAME AND MIN AGE FNAME IN VARIABLE BY USING SUBQUERY THEN DISPLAYING IT
		set @x=(select fname from Patient where age=(select max(age) from Patient limit 1));

	/* DISPLAYING THE VALUES WHICH WE STORED */
		select @y as youngest, @x as eldest;

	-- THIS IS WITHOUT USING ORDER BY AND VARIABLES IT IS CALLED AS SCALER FUNTIONS
		select (select fname from Patient where age=(select min(age) from Patient)) as youngest,
		       (select fname from Patient where age=(select max(age) from Patient)) as eldest;
       
       
# DISTINCT CLAUSE:

	-- mental model 
	/*
	SELECT DISTINCT A, B, C
			↓
	Compare (A, B, C) as ONE combination
			↓
	Remove identical combinations
	*/
    
    -- 1. It removes duplicate rows from the result
		select distinct fname from Patient;
        
	-- 2. DISTINCT applies to the complete SELECT list
		select distinct fname, age from Patient;
        
	-- 3. You can select multiple columns
		select distinct fname, lname,age from Patient;
        
	-- 4. You cannot use DISTINCT for only one column when selecting others
    
	-- 5. DISTINCT works with expressions
		select distinct age+5,age from Patient;
        
	-- 6. COUNT(DISTINCT column) is different and very important
		select count(distinct fname) from Patient;
        -- here count will count the number of not null distinct fnames 
		
	-- 7. DISTINCT does not remove NULL from the result
		select distinct salary from Employee;

# DATA AND TIME FUNCTIONS

	-- 1. CURDATE() it will return current data values
		set @time = (select curdate());
		set @time = curdate();
		select @time;

	-- 2. CURRENT_TIMESTAMP it will return current time and date
		set @time = current_timestamp;
        set @time = current_timestamp();
		select @time;

	-- 3. SYSDATE it will return current time and date
		select sysdate();

	-- 4. CURRENT TIME it will return current time value
		select current_time();

	-- > DIFFIRENCE BETWEEN CURRENT_TIMESTAMP AND SYSDATE
		select sysdate(), sleep(5), sysdate();
		select current_timestamp(),sleep(5),current_timestamp();
        
	-- 5. YEAR() it will return year number from mentioned data
		set @year=current_timestamp();
        set @year=sysdate();
        set @year=time();
        select year('2026-04-02');
        
        select (@year);
        
	-- 6. day() it will return day number
		select day('2026-8-11');
        
	-- 7. month() it will return month number
		select month(curdate());
        
	-- 8. hour() it will return hour value
		select hour('10:70:22');
		select hour(current_timestamp());
        select hour(sysdate());
        select hour(current_time());
        
	-- 9. minute() it will return minute values
		select minute(sysdate());
        
	-- 10. dayname() will return day name 
		select dayname(curdate());
        select dayname('2026-08-11');
        
	-- 11. monthname() will return month name
		select monthname(sysdate());
        
	-- 12. week() will return week number from JANUARY
		select week(curdate());
	
    -- 13. weekday() will return weeek day number start from monday with 0
		select weekday(sysdate());
        
	-- 14. date_add() is used to add the specidfic time/date interval 
    
		-- date
		select date_add(curdate(),interval 3 day);
        select date_add(curdate(),interval 3 month);
        select date_add(sysdate(),interval 3 year);
        select date_add( 
						date_add(
								date_add(curdate(),
                                interval 3 day),
						interval 3 month),
				interval 3 year) as date;
                
		-- time
        select date_add(current_time(),interval 3 hour);
        select date_add(sysdate(),interval 3 minute);
        select date_add(current_timestamp(),interval 3 second);
		
                
	-- 15. date_sub() will substract a time/date intervals from mention date or time 
		-- date
		select date_sub(curdate(),interval 1 day);
        select date_sub(sysdate(),interval 1 month);
        select date_sub(current_timestamp(),interval 1 year);
        -- time 
        select date_sub(current_time(),interval 1 second);
        select date_sub(current_time(),interval 1 minute);
        select date_sub(current_time(),interval 1 hour);
        
	-- 16. date_diff() it is used to find difference between two date/time values it will returns in number of days
		-- date 
        select datediff('2027-06-01',curdate());
        select datediff(curdate(),'2026-12-15');
        -- time 
        select timediff(current_time(),'15:02:12');

# CAST AND CONVERT FUNCTION;
	set @x ='2026-07-31';
    select cast(@x as date);
    select convert(@x,date);

		

