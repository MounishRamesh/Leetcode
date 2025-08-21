SELECT ROUND(SUM(tiv_2016),2) as tiv_2016 FROM Insurance
where 
tiv_2015 in(
    SELECT tiv_2015 FROM Insurance group by tiv_2015 HAVING count(tiv_2015) >1) 
AND 
(lat,lon) in
(select lat,lon from insurance group by lat,lon having count(*) = 1) ;