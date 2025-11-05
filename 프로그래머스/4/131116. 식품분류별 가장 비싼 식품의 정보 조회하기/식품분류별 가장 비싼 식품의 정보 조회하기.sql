SELECT P.CATEGORY, max(P.PRICE) as MAX_PRICE, P.PRODUCT_NAME
from FOOD_PRODUCT P
JOIN (
    select CATEGORY, max(PRICE) as MAX_PRICE
    from FOOD_PRODUCT
    where CATEGORY in ('과자', '국', '김치', '식용유')
    group by CATEGORY
) M
on P.CATEGORY = M.CATEGORY
and P.PRICE = M.MAX_PRICE
group by CATEGORY, PRODUCT_NAME
order by MAX_PRICE desc;