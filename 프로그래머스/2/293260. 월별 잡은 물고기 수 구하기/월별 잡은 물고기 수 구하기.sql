select count(ID) as FISH_COUNT, month(TIME) as MONTH
from FISH_INFO
GROUP BY MONTH(TIME)
order by month(TIME);