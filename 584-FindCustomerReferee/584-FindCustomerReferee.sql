-- Last updated: 09/09/2026, 16:27:30
# Write your MySQL query statement below
SELECT name 
FROM Customer
WHERE referee_id !=2 OR referee_id IS NULL;