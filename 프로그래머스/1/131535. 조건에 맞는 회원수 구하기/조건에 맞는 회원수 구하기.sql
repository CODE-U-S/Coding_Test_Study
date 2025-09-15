SELECT count(*) as USERS 
from USER_INFO
where year(JOINED) = 2021
and AGE between 20 and 29;