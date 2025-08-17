# Write your MySQL query statement below
SELECT t.* , if( x+y > z AND y+z > x AND z+x > y, 'Yes','No') AS triangle  from Triangle as t ;