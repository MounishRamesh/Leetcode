# Write your MySQL query statement below
select query_name , Round((SUM(rating/position))/count(query_name),2) as quality ,
ROUND(100 * SUM(CASE WHEN rating < 3 then 1 else 0 end)/count(query_name),2) as poor_query_percentage
from queries as q 
group by query_name ;