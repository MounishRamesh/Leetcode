-- # Write your MySQL query statement below
-- select p.firstname , p.lastname , a.city , a.state
-- from person as p
-- left join address as a
-- on a.personId = p.personId;

# Write your MySQL query statement below
SELECT firstName, lastName, city, state
FROM Person
LEFT JOIN Address 
ON Person.personID = Address.personID