-- 코드를 입력하세요
SELECT product_code, (price * sum(sales_amount)) sales
from product p
inner join OFFLINE_SALE o on o.product_id = p.product_id
group by p.product_code
order by sales desc, product_code