select ROUTE,
    concat(round(sum(D_BETWEEN_DIST), 1), 'km') as TOTAL_DISTANCE,
    concat(round(avg(D_BETWEEN_DIST), 2), 'km') as AVERAGE_DISTANCE
from SUBWAY_DISTANCE
group by ROUTE
order by sum(D_BETWEEN_DIST) desc;