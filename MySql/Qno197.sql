# 197. Rising Temperature
# Write your MySQL query statement below
select t1.id from Weather as t1, Weather as t2
where t1.Temperature>t2.Temperature and 
datediff(t1.Recorddate, t2.Recorddate)=1