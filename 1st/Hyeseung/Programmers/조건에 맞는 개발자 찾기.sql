-- 코드를 작성해주세요
select distinct id, email, first_name, last_name 
from developers d 
inner join skillcodes s on s.code & d.skill_code = s.code
where s.name = 'C#' or s.name = 'Python'
order by d.id