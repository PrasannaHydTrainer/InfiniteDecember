SELECT * FROM infinite_december.emp;

-- Write a query to display ManagerName as 
-- For CLERK 'Avesh'
-- For SALESMAN 'Chetan'
-- For MANAGER 'Sujay'
-- For ANALYST 'Subodh'
-- For President 'No Manager'

select Empno, Ename, job,
CASE JOB
	WHEN 'CLERK' THEN 'AVESH'
    WHEN 'SALESMAN' THEN 'Chetan'
    WHEN 'MANAGER' THEN 'Sujay'
    WHEN 'ANALYST' THEN 'Subodh'
    WHEN 'PRESIDENT' THEN 'NO Manager'
    else 'Invalid Records'
END 'ManagerName'
from Emp;

