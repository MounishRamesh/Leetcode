# Write your MySQL query statement below
SELECT s.student_id ,s.student_name ,su.subject_name ,count(e.subject_name) as attended_exams
from Students as s cross join Subjects as su
left join Examinations as e
on e.student_id = s.student_id AND su.subject_name = e.subject_name
group by student_id ,subject_name 
order by s.student_id , su.subject_name;