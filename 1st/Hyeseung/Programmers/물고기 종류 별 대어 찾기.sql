select id, fish_name, length
from fish_info i
inner join fish_name_info n
on n.fish_type = i.fish_type
where i.fish_type in (
    select fish_type
    from fish_info
    group by fish_type
    having length = max(length)
)