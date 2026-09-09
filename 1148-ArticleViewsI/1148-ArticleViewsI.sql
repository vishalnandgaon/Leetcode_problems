-- Last updated: 09/09/2026, 16:20:49
# Write your MySQL query statement below
SELECT DISTINCT author_id as id
FROM Views
WHERE author_id =viewer_id
ORDER BY id