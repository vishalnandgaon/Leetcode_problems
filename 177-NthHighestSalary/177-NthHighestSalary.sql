-- Last updated: 09/09/2026, 16:32:56
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      WITH CTE AS(
        SELECT salary,DENSE_RANK() OVER(ORDER BY salary DESC) AS rnk
        FROM Employee
      )

      SELECT salary 
      FROM CTE
      WHERE rnk=N
      LIMIT 1
  );
END