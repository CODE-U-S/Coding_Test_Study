SELECT P.ID, P.NAME, P.HOST_ID
from PLACES P
where P.HOST_ID in (
    select HOST_ID
    from PLACES
    group by HOST_ID
    having count(*) >= 2
    )
order by P.ID;