SELECT CAR_ID,
    case
        when sum(
            case
                when '2022-10-16' between START_DATE and END_DATE
                then 1 else 0
            end
        ) > 0
        then '대여중' else '대여 가능'
        end as AVAILABILITY
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by CAR_ID
order by CAR_ID desc;