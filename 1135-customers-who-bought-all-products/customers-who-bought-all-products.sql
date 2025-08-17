# Write your MySQL query statement below
select c.customer_id from customer as c 
group by c.customer_id 
HAVING count(distinct c.product_key) = (SELECT count(product_key) from product);

# Write your MySQL query statement below
-- select c.customer_id from customer as c 
-- join Product as p
-- on p.product_key = c.product_key 
-- group by c.customer_id 
-- HAVING count(c.product_key) = (select count(product_key) from product);