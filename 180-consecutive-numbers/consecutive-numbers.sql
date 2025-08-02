# Write your MySQL query statement below
select DISTINCT l1.num as ConsecutiveNums 
FROM logs as l1
join logs as l2 on 
l1.id = l2.id - 1
join logs as l3 on 
l2.id = l3.id - 1
where l1.num = l2.num && l2.num = l3.num ;