-- Last updated: 09/09/2026, 16:21:32
# Write your MySQL query statement below
SELECT p.product_name as product_name,s.year as year,s.price as price
FROM Sales as s
LEFT JOIN Product as p
ON s.product_id=p.product_id
