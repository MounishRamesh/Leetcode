# Write your MySQL query statement below
select r.contest_id , ROUND(100 * count(u.user_id)/(select count(*) from users ),2)as percentage from Users as u
join Register as r
on r.user_id = u.user_id 
group by r.contest_id
order by percentage desc , contest_id asc;