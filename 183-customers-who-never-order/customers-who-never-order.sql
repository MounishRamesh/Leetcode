# Write your MySQL query statement below
select c.name as Customers 
from customers as c left join Orders as o
on C.ID = O.customerId
where customerId is NULL ;
