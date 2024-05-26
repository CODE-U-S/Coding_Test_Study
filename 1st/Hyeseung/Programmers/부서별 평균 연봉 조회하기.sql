select d.dept_id, d.dept_name_en, round(avg(e.sal), 0) avg_sal
from hr_department d
inner join hr_employees e on e.dept_id = d.dept_id
group by dept_id
order by avg_sal desc