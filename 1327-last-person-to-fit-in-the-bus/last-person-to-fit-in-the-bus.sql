# Write your MySQL query statement below
select t.person_name from (select person_name , turn , sum(weight)over (order by turn) as s from queue) as t 
where s <= 1000 
order by turn  desc
limit 1;