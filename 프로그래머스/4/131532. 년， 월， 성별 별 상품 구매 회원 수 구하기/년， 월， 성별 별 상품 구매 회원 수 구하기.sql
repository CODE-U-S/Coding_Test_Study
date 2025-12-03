SELECT YEAR(O.SALES_DATE) as YEAR,
        MONTH(O.SALES_DATE) as MONTH,
        I.GENDER,
        count(distinct O.USER_ID) as USERS
from USER_INFO I
join ONLINE_SALE O
on I.USER_ID = O.USER_ID
where I.GENDER is not null
group by YEAR, MONTH, I.GENDER

order by YEAR asc, MONTH asc, I.GENDER asc;