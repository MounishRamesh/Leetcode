# Write your MySQL query statement below
select p.project_id , ROUND(sum(e.experience_years)/COUNT(p.project_id),2) as average_years from Project as p
left join Employee as e
on p.employee_id = e.employee_id
group by p.project_id;