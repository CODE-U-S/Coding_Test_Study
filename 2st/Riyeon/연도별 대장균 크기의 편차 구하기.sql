with T1 as(select max(size_of_colony) as maxc,
           year(differentiation_date)as yeard
           from ecoli_data
           group by yeard)
select year(differentiation_date) as year, 
abs(size_of_colony - T1.maxc) as year_dev, id
from ecoli_data
inner join T1 on year(ecoli_data.differentiation_date) = T1.yeard
order by year, year_dev asc;