-- Last updated: 09/09/2026, 16:21:20
# Write your MySQL query statement below
SELECT player_id,MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id