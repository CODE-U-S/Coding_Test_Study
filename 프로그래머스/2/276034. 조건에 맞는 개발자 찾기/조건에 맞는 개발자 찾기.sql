select distinct D.ID, D.EMAIL, D.FIRST_NAME, D.LAST_NAME
from SKILLCODES S
join DEVELOPERS D
on S.CODE & D.SKILL_CODE != 0
where S.NAME IN ('Python', 'C#')
order by D.ID;