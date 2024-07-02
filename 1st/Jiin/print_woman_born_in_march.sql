SELECT member_id, member_name, gender, TO_CHAR(date_of_birth,'YYYY-MM-DD') date_of_birth
FROM member_profile
WHERE gender = 'W' AND EXTRACT(month from date_of_birth) = '3' AND tlno is not NULL
ORDER BY member_id;
