-- To change to the particular database 

use infinite_december;

-- To see list of tables avaialble in current db

show tables;

-- Display structure or info about Emp table 

desc Emp;

-- Show all records from Emp table 

select * from Emp;

-- Display Empno, Ename, job, sal, mgr from Emp table 

select Empno, Ename, job, sal, mgr
from Emp;

-- Where clause : Used to filter the table records 

-- Display all records whose sal > 2000;

select * from Emp where sal > 2000;

-- Display all records whose job is 'MANAGER' 

select * from Emp where job='MANAGER';

-- Between...And  : Display records from start to end range 

select * from Emp where sal between 1000 and 2000;

select * from Emp where sal not between 1000 and 2000;

-- IN clause : Used to display values for particular field. 

select * from Emp where job in('CLERK','MANAGER','PRESIDENT'); 

select * from Emp where job not in('CLERK','MANAGER','PRESIDENT');

-- Like Operator : Used to display records w.r.t. Wild cards (%, _)

select * from Emp where ename like 'S%';

select * from emp where ename like '%S';

select * from Emp where ename like 'J__ES';

-- Order By : Used to display data w.r.t Specific Field(s) in 
-- ascending or descending order

select Empno, Ename, job, sal, Mgr from Emp 
order by Ename;

select Empno, Ename, job, sal, Mgr from Emp 
order by 2;

select Empno, Ename, job, sal, Mgr from Emp 
order by job, Ename;

select Empno, Ename, job, sal, Mgr from Emp 
order by job, Ename desc;

