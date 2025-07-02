-- # Write your MySQL query statement below
-- SELECT Email 
-- FROM person 
-- group by Email
-- Having count(*) > 1 ;


select email
from person
group by email
having count(*)>1