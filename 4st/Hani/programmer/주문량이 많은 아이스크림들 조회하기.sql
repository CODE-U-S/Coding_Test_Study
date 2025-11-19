SELECT H.FLAVOR
from FIRST_HALF H
join (
    select FLAVOR, sum(TOTAL_ORDER) as JULY_TOTAL_ORDER
    from JULY
    group by FLAVOR
    ) J
on H.FLAVOR = J.FLAVOR
order by (H.TOTAL_ORDER + J.JULY_TOTAL_ORDER) desc
limit 3;