select ID, case 
    when NTILE(4) over (order by SIZE_OF_COLONY) = 4 then 'CRITICAL'
    when NTILE(4) over (order by SIZE_OF_COLONY) = 3 then 'HIGH'
    when NTILE(4) over (order by SIZE_OF_COLONY) = 2 then 'MEDIUM'
    else 'LOW' end as 'COLONY_NAME'
from ECOLI_DATA
order by ID
