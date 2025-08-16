SELECT e.employee_id , e.name , COUNT(e1.reports_to) as reports_count , ROUND(AVG(e1.age),0)  AS average_age
from Employees as e1
join Employees as e 
on e1.reports_to = e.employee_id 
GROUP by e.employee_id
order by e.employee_id ;
