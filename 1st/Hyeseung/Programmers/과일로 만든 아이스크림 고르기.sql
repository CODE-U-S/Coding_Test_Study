select f.flavor from first_half f inner join icecream_info i on i.flavor = f.flavor
where i.INGREDIENT_TYPE = 'fruit_based' and f.total_order > 3000 order by total_order desc