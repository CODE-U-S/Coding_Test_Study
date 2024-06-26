-- 코드를 작성해주세요
select CONCAT(LENGTH, 'cm') as 'MAX_LENGTH'
from FISH_INFO 
order by `LENGTH` DESC
limit 1;