# Write your MySQL query statement below
SELECT Email 
FROM person 
group by Email
Having count(*) > 1 ;