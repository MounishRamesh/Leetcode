-- CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
-- BEGIN
--   set n = n-1 ;
--   RETURN (
--        select DISTINCT SALARY from Employee
--        order by salary DESC
--        LIMIT 1 OFFSET n
--   );
-- END

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N = N - 1;
  RETURN (
      # Write your MySQL query statement below.
        SELECT (
            SELECT DISTINCT Salary FROM Employee ORDER BY Salary DESC LIMIT 1 OFFSET N 
        ) AS Result
  );
END