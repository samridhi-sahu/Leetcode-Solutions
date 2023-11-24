# 1068. Product Sales Analysis I
# Write your MySQL query statement below

select product_name, year, price
from Sales LEFT JOIN Product
on Sales.product_id = Product.product_id