# Write your MySQL query statement below
SELECT P.product_name , SUM(o.unit) as unit from  Products as p
JOIN Orders as o
ON p.product_id = o.product_id 
WHERE YEAR(o.order_date) = 2020 &&  MONTH(o.order_date) = 2
GROUP BY p.product_id
HAVING sum(o.unit) >= 100;