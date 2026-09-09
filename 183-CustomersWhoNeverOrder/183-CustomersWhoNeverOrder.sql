-- Last updated: 09/09/2026, 16:32:42
# Write your MySQL query statement below
SELECT name as Customers
FROM Customers as c
LEFT JOIN Orders as o
ON c.id=o.customerId
WHERE o.customerId IS NULL;