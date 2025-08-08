SELECT p.product_id , IFNULL (Round(sum(p.price*u.units)/SUM(u.UNITS),2),0) as average_price from 
Prices as p
Left join UnitsSold as u
on (p.product_id = u.product_id)
and u.purchase_date between p.start_date and p.end_date
group by p.product_id;