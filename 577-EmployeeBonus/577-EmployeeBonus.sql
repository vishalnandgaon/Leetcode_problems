-- Last updated: 09/09/2026, 16:27:35
# Write your MySQL query statement below
SELECT name,b.bonus as bonus
FROM Employee e
LEFT JOIN Bonus b
ON e.empId=b.empId
WHERE b.bonus<1000 OR b.bonus IS NULL