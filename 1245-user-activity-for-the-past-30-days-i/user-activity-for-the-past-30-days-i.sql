# Write your MySQL query statement below
select a.activity_date as day , count(distinct a.user_id) as active_users from activity as a
where a.activity_date  BETWEEN '2019-06-28' AND '2019-07-27'
GROUP by a.activity_date
HAVING COUNT(a.user_id) > 0;