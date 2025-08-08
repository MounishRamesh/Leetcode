# Write your MySQL query statement below
SELECT  id , movie , description , rating from Cinema as c1
where c1.description <> 'boring' AND id%2 = 1
order by rating desc  ;