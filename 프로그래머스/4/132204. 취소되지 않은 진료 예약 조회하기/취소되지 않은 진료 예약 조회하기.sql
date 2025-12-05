SELECT A.APNT_NO, P.PT_NAME, P.PT_NO, A.MCDP_CD, D.DR_NAME, A.APNT_YMD
from APPOINTMENT A
join PATIENT P
    on A.PT_NO = P.PT_NO
join DOCTOR D
    on A.MDDR_ID = D.DR_ID
where A.MCDP_CD = 'CS'
    and A.APNT_CNCL_YN = 'N'
    and date(A.APNT_YMD) = '2022-04-13'
order by A.APNT_YMD;