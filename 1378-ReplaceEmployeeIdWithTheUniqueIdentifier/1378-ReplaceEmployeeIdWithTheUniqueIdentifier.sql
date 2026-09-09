-- Last updated: 09/09/2026, 16:18:39
# Write your MySQL query statement below
SELECT e.unique_id as unique_id, e1.name as name
FROM Employees e1
LEFT JOIN EmployeeUNI e
ON e1.id=e.id