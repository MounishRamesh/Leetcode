SELECT  e.employee_id from Employees as e
LEFT JOIN Employees as e1
on e.manager_id = e1.employee_id 
where e.salary < 30000 AND e1.employee_id IS NULL AND e.manager_id IS NOT NULL
order by e.employee_id;