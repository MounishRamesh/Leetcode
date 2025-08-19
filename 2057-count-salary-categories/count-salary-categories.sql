-- WITH CTE AS(
--     SELECT account_id ,
--     CASE
--         WHEN income < 20000 then 'Low Salary'
--         WHEN income >= 20000 AND income <= 50000 then 'Average Salary'
--         WHEN income > 50000 then 'High Salary'
--         END AS category 
-- from accounts) , 

-- CTE_C as (
--     SELECT "Low Salary" as Category
--     UNION 
--     SELECT "Average Salary" as Category
--     UNION 
--     SELECT "High Salary" as Category
-- )

-- SELECT CTE_C.Category, COUNT(account_id) as accounts_count FROM CTE_C 
-- LEFT JOIN CTE ON CTE_C.Category = CTE.Category
-- GROUP BY CTE_C.Category ;


# Write your MySQL query statement below
-- low salary > 20000
-- avg salary in 20000-50000
-- high salary < 50000

with cte as (
    select 
        count(case when income > 50000 then 1 end) as high,
        count(case when income between 20000 and 50000 then 1 end) as avg,
        count(case when income < 20000 then 1 end) as low
    from accounts
)

select 'Low Salary' as Category, low as accounts_count from cte
union all
select 'Average Salary' as Category, avg as accounts_count from cte
union all
select 'High Salary' as Category, high as accounts_count from cte