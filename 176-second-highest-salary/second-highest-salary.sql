# Write your MySQL query statement below

SELECT (select distinct salary as SecondHighestSalary 
from Employee
order by salary desc
limit 1 offset 1) AS SecondHighestSalary ;