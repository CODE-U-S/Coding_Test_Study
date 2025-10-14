select count(I.ID) as FISH_COUNT, N.FISH_NAME as FISH_NAME 
from FISH_INFO I
join FISH_NAME_INFO N
on I.FISH_TYPE = N.FISH_TYPE
group by FISH_NAME
order by count(I.ID) desc;