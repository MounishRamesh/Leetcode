SELECT p.product_id , p.product_name
FROM Product AS p
WHERE p.product_id IN (
    SELECT s.product_id
    FROM Sales AS s
    WHERE s.sale_date BETWEEN '2019-01-01' AND '2019-03-31'
    GROUP BY s.product_id
    HAVING COUNT(*) = (
        SELECT COUNT(*)
        FROM Sales AS s2
        WHERE s2.product_id = s.product_id
    )
);
