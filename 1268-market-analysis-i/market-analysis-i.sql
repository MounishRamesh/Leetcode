# Write your MySQL query statement below
SELECT u.user_id as buyer_id, u.join_date ,count(o.order_id) as orders_in_2019 FROM users as u
LEFT join (SELECT * from Orders where YEAR(order_date) = '2019') as o 
ON o.buyer_id = u.user_id 
group by u.user_id;