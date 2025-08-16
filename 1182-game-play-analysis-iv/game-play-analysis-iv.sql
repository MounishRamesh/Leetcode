select ROUND(count(*)/(select count(distinct player_id) from activity),2) fraction from Activity as a
join 
(select act.player_id , MIN(act.event_date) as min_value from activity as act
group by act.player_id)
as a1
on a.player_id = a1.player_id 
where a.event_date = DATE_ADD(min_value , INTERVAL 1 DAY) ;