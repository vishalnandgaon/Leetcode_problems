-- Last updated: 09/09/2026, 16:27:12
# Write your MySQL query statement below
SELECT id,movie,description,rating 
FROM Cinema
WHERE id%2!=0 AND description !='boring'
ORDER BY rating DESC;