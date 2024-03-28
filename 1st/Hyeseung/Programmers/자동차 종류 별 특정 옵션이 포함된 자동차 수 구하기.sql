SELECT car_type, count(*) cars from car_rental_company_car
where options like '%통풍시트%' or options like '%열선시트%' or options like '%가죽시트%'
group by car_type order by car_type