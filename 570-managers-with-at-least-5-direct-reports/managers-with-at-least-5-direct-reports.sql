# Write your MySQL query statement below
select e2.name from Employee as e1 
join Employee as e2
on e1.managerid = e2.id 
group by  e1.managerid , e2.name
having count(*) >= 5 ;