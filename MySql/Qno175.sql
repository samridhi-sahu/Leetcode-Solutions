<<<<<<< HEAD
# 175. Combine Two Tables

# Write your MySQL query statement below

select firstName, lastName, city, state
from Person 
left join Address on
=======
# 175. Combine Two Tables

# Write your MySQL query statement below

select firstName, lastName, city, state
from Person 
left join Address on
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
Person.personId = Address.personId 