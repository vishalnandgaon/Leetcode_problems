-- Last updated: 09/09/2026, 16:32:53
# Write your MySQL query statement below
WITH CTE AS(
    SELECT score, DENSE_RANK() OVER(ORDER BY score DESC) AS rnk
    FROM Scores
)

SELECT score,rnk as `rank`
FROM CTE