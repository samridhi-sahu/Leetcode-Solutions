# 1378. Replace Employee ID With The Unique Identifier
# Write your MySQL query statement below

select EmployeeUNI.unique_id, Employees.name
from Employees LEFT JOIN EmployeeUNI
on Employees.id = EmployeeUNI.id