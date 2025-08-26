# Write your MySQL query statement below
SELECT u.name , CASE 
                WHEN r.distance is null then 0 else SUM(r.distance)
                END 
                as travelled_distance FROM Users as u
LEFT JOIN Rides as r
ON u.id = r.User_id 
GROUP BY u.ID
ORDER BY travelled_distance DESC , u.name ASC;
