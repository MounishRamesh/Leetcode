CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  set n = n-1 ;
  RETURN (
       select DISTINCT SALARY from Employee
       order by salary DESC
       LIMIT 1 OFFSET n
  );
END