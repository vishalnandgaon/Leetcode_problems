-- Last updated: 09/09/2026, 16:15:31
# Write your MySQL query statement below
SELECT tweet_id
FROM Tweets
WHERE LENGTH(content)>15;