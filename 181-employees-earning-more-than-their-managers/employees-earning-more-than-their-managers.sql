-- # Write your MySQL query statement below

-- SELECT e.name as Employee 
-- FROM employee as e
-- join employee as m
-- on e.managerid = m.Id
-- where e.salary > m.salary ;

# Write your MySQL query statement below
Select e1.name as Employee from Employee as e1 inner join Employee as e2 on e2.id = e1.managerId where e1.salary>e2.salary