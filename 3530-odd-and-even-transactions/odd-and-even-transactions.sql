# Write your MySQL query statement below
SELECT t.transaction_date ,
  SUM(case when t.amount%2 = 1 then t.amount else 0 end)as odd_sum ,
  SUM(case when t.amount%2 = 0 then t.amount else 0 end)as even_sum
FROM transactions as t
group by t.transaction_date 
order by t.transaction_date;