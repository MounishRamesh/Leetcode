-- -- # Write your MySQL query statement below
-- SELECT * from (SELECT * from Stocks where operation = 'Sell') as ANS ;
Select ans.stock_name , b-s as capital_gain_loss
from (SELECT stock_name , sum(price) as s from Stocks where operation = 'Buy'
group by stock_name) as ans
inner join 
(SELECT stock_name , sum(price) as b from Stocks where operation = 'Sell'
group by stock_name) as ans1
on  ans.stock_name = ans1.stock_name ;
-- group by ans.stock_name;


