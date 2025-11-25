select C.ID
from ECOLI_DATA A
join ECOLI_DATA B on B.PARENT_ID = A.ID
join ECOLI_DATA C on C.PARENT_ID = B.ID
where A.PARENT_ID is null
order by ID;