# Write your MySQL query statement below

SELECT e.name as Employee 
FROM employee as e
join employee as m
on e.managerid = m.Id
where e.salary > m.salary ;