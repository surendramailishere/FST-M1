REM   Script: Activity7
REM   Activity7

DESC orders


select sum(purchase_amount) from orders;

select avg(purchase_amount) from orders;

select max(purchase_amount) from orders;

select min(purchase_amount) from orders;

select count(salesman_id) from orders;

