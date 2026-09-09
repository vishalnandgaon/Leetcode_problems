-- Last updated: 09/09/2026, 16:32:45
# Write your MySQL query statement below
SELECT e.name as Employee
FROM Employee e
INNER JOIN Employee m
ON e.managerId=m.id
WHERE e.salary>m.salary;
