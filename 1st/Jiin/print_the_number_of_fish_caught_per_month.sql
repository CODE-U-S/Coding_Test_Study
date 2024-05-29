select count(ID) FISH_COUNT, month(time) MONTH
from fish_info
group by month(time)
order by 2;
