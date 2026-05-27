select distinct D.ID, D.EMAIL, D.FIRST_NAME, D.LAST_NAME
from SKILLCODES S
join DEVELOPERS D
on D.SKILL_CODE & S.CODE
where S.CATEGORY = 'Front End' 
    and (D.SKILL_CODE & S.CODE) != 0
order by ID asc;
