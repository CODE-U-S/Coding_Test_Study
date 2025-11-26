select I.ID, N.FISH_NAME, I.LENGTH 
from FISH_INFO I
join FISH_NAME_INFO N
on I.FISH_TYPE = N.FISH_TYPE
where (I.FISH_TYPE, I.LENGTH) in (
        select
            FISH_TYPE,
            max(LENGTH)
        from
            FISH_INFO
        group by
            FISH_TYPE
    )
order by I.ID;