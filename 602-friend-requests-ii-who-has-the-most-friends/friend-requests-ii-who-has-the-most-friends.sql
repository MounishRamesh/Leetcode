# Write your MySQL query statement below
SELECT  id , count(*) as num FROM ((SELECT  requester_id as id from RequestAccepted)
UNION ALL 
(select accepter_id AS id FROM RequestAccepted)) AS ans
GROUP BY id
ORDER BY num DESc
LIMIT 1 ;
