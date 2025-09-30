SELECT ANIMAL_TYPE, count(ANIMAL_TYPE) as 'count'
from ANIMAL_INS
group by ANIMAL_TYPE
order by
    CASE 
        WHEN ANIMAL_TYPE = 'Cat' THEN 1
        WHEN ANIMAL_TYPE = 'Dog' THEN 2
    END;