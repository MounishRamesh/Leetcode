SELECT e.employee_id , e.department_id FROM Employee as e
WHERE e.primary_flag = 'Y' OR employee_id IN 
(select employee_id from employee group by employee_id
having count(*) = 1) ;