SELECT ROUND(SUM(immediate_percentage)/count(*),2) as immediate_percentage from
( select ROUND(100 * COUNT(*)/count(case WHEN D.ORDER_DATE = D.customer_pref_delivery_date THEN 1 END),2) as immediate_percentage
FROM delivery as d
WHERE d.order_date = (
    SELECT MIN(order_date) 
    FROM Delivery  
    where customer_id = d.customer_id
)
GROUP BY D.customer_id) as sub;
