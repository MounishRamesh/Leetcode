# Write your MySQL query statement below
SELECT P.project_id , ROUND(AVG(e.experience_years),2) as average_years FROM Project as p 
join Employee as e 
ON P.employee_ID = E.employee_id
group by p.project_id;