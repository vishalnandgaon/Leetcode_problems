-- Last updated: 09/09/2026, 16:27:22
# Write your MySQL query statement below
SELECT class 
FROM Courses
GROUP BY class
HAVING COUNT(*)>=5;