# Write your MySQL query statement below
SELECT product_id , 10 as price from Products group by product_id Having MIN(change_date) > '2019-08-16'  
UNION
SELECT product_id , new_price as price from products
where (product_id , change_date) in (select p.product_id , MAX(p.change_date) from products as p where p.change_date <= '2019-08-16' GROUP BY product_id);