-- Last updated: 21/02/2026, 22:39:49
# Write your MySQL query statement below
SELECT Person.firstName,Person.lastName,Address.city,Address.state
FROM Person
LEFT JOIN Address
ON Person.personId=Address.personId;
