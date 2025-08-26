# Write your MySQL query statement below
select u.name , SUM(t.amount) as balance from Users as u
join Transactions as t
on t.account = u.account
group by u.name
HAVING balance > 10000;