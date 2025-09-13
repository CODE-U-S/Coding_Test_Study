select NAME, COUNT(NAME) as COUNT
    from ANIMAL_INS
    group by NAME
    having NAME is not NULL and count(NAME) >= 2
    order by NAME;