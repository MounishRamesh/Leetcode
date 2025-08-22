# Write your MySQL query statement below
SELECT customer_number 
FROM Orders
group by CUSTOMER_number
ORDER BY COUNT(customer_number) DESC
LIMIT 1;