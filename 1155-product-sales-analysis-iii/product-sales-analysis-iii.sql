# Write your MySQL query statement below
select s.product_id , s.year as first_year , s.quantity , s.price
from Sales as s join (select MIN(YEAR) as min_val , product_id from sales group by product_id ) as s1
on s.product_id = s1.product_id and s.year = min_val;