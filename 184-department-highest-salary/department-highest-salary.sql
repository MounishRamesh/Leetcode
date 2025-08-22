-- # Write your MySQL query statement below
SELECT d1.name as Department , e1.name as Employee , e1.salary as Salary from EMPLOYEE as e1
join Department as d1
on e1.departmentId = d1.id 
where (d1.name , e1.salary) in 
(select d.name as Department ,MAX(e.salary) as salary FROM Employee as e
JOIN Department as d
on e.departmentId = d.id 
GROUP by e.departmentId) ;