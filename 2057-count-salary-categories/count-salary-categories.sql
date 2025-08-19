WITH CTE AS(
    SELECT account_id ,
    CASE
        WHEN income < 20000 then 'Low Salary'
        WHEN income >= 20000 AND income <= 50000 then 'Average Salary'
        WHEN income > 50000 then 'High Salary'
        END AS category 
from accounts) , 

CTE_C as (
    SELECT "Low Salary" as Category
    UNION 
    SELECT "Average Salary" as Category
    UNION 
    SELECT "High Salary" as Category
)

SELECT CTE_C.Category, COUNT(account_id) as accounts_count FROM CTE_C 
LEFT JOIN CTE ON CTE_C.Category = CTE.Category
GROUP BY CTE_C.Category ;
