SELECT * FROM infinite_december.dept;

-- Write a Query, as For dname field as
 -- For 'ACCOUNTING' HEADoFFICE as 'Hyderabad'
--  For 'RESEARCH' HeadOffice as 'Delhi'
--  For 'SALES' headOffice as 'PUNE'
--  For 'OPERATIONS' headOffice as 'Mumbai'

select deptno, dname, loc,
case dname
  WHEN 'ACCOUNTING' THEN 'HYDERABAD'
  WHEN 'RESEARCH' THEN 'DELHI'
  WHEN 'SALES' THEN 'PUNE'
  WHEN 'OPERATIONS' THEN 'MUMBAI'
end 'HeadOffice'
from Dept;

SELECT * FROM eMP;

select Empno, Ename, job, sal, comm, 
case 
when comm is NULL THEN 0  else comm
end 'Updated'
from Emp;

select empno, ename, job, sal, comm,
case 
  when comm is null then sal else sal+comm
end 'TakeHome'
from Emp;
