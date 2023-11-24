# 1581. Customer Who Visited but Did Not Make Any Transactions
# Write your MySQL query statement below
select customer_id, COUNT(customer_id) AS count_no_trans
from Visits LEFT JOIN Transactions
ON Visits.visit_id = Transactions.visit_id
where Transactions.transaction_id IS NULL
group by customer_id