-- 코드를 입력하세요
SELECT truncate(price,-4) price_group, count(*)
from product
group by price_group
order by price_group