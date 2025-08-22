SELECT s.name FROM SalesPerson as s
where s.sales_id not in (SELECT O.SALES_ID FROM Orders as o
join Company as c 
on o.com_id = c.com_id AND c.name = 'RED')
;