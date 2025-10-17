# Write your MySQL query statement below
SELECT  e.employee_id,e.name , count(e1.reports_to) as reports_count , ROUND(AVG(e1.age)) AS average_age
from Employees as e
join Employees as e1
on e.employee_id = e1.reports_to 
group by e1.reports_to
order by e.employee_id ;