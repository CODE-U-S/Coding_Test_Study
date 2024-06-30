-- 코드를 입력하세요
SELECT i.name, i.datetime
from animal_ins i
left join animal_outs o on i.animal_id = o.animal_id
where o.animal_id is null
order by i.datetime
limit 3