# Write your MySQL query statement below
SELECT employees.name , employeeUNI.unique_id 
FROM employees 
left join EmployeeUNI
on employees.id = employeeUNI.id 
ORDER BY  employees.name;