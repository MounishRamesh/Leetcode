

SELECT ROUND(
    SUM(CASE WHEN ORDER_DATE = customer_pref_delivery_date THEN 1 ELSE 0 END)*100 / count(*),2 
) as immediate_percentage FROM Delivery 
where (customer_id , order_date ) IN
(SELECT customer_id , Min(order_date) from Delivery as d group by d.customer_id ) ;