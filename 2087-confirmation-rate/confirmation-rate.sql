-- SELECT s.user_id , ROUND(
--     CASE 
--     when count(c.action) = 0 then 0 
--     ELSE sum(case when c.action = 'confirmed' then 1 else 0 end)* (1.0)/count(c.action)
--     END , 2) as confirmation_rate
-- from Signups as s
-- left join Confirmations as c
-- on s.user_id = c.user_id 
-- group by s.user_id
-- order by s.user_id ;

# Write your MySQL query statement below
select s.user_id, round(avg(if(c.action = 'confirmed', 1, 0)),2) as confirmation_rate
from signups s 
left join confirmations c
on s.user_id = c.user_id
group by s.user_id