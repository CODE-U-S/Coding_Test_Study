SELECT P.MEMBER_NAME, R.REVIEW_TEXT, date_format(R.REVIEW_DATE, '%Y-%m-%d') as REVIEW_DATE
from MEMBER_PROFILE P
join REST_REVIEW R
on P.MEMBER_ID = R.MEMBER_ID
where R.MEMBER_ID = (
    select MEMBER_ID
    from (
        select MEMBER_ID, count(*) as CNT
        from REST_REVIEW
        group by MEMBER_ID
        order by CNT desc
        limit 1
    )as T
)
order by REVIEW_DATE asc, REVIEW_TEXT asc;