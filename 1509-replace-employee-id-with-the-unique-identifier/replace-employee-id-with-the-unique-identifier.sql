# Write your MySQL query statement below
-- SELECT employees.name , employeeUNI.unique_id 
-- FROM employees 
-- left join EmployeeUNI
-- on employees.id = employeeUNI.id 
-- ORDER BY  employees.name;
# Write your MySQL query statement below
select EU.unique_id,E.name
from EmployeeUNI as EU
right join Employees as E
on EU.id=E.id;