# Write your MySQL query statement below
SELECT case
        WHEN id%2 = 1 AND id < (SELECT MAX(id) FROM seat) THEN id+1
        WHEN id%2 = 0 THEN id-1 
        ELSE id
    END AS id ,
    student
    from Seat 
ORDER BY id ;