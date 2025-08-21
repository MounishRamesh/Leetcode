WITH ranked AS (
    SELECT 
        id,
        name,
        salary,
        departmentId,
        DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY salary DESC) AS rnk
    FROM Employee
)
SELECT 
    d.name AS Department,
    r.name AS Employee,
    r.salary
FROM ranked r
JOIN Department d
    ON r.departmentId = d.id
WHERE r.rnk <= 3
ORDER BY r.id;
