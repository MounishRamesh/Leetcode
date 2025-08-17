# Write your MySQL query statement below
SELECT t.* , (CASE when x+y > z AND y+z > x AND z+x > y then 'Yes' ELSE'No' END ) AS triangle  from Triangle as t ;