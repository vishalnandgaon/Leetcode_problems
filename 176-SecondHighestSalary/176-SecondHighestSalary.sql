-- Last updated: 09/09/2026, 16:32:58
# Write your MySQL query statement below
WITH CTE AS(
    SELECT DISTINCT salary,DENSE_RANK() OVER (ORDER BY salary DESC) as rnk
    FROM Employee
)

SELECT(SELECT salary
FROM CTE
WHERE rnk=2)
as SecondHighestSalary;