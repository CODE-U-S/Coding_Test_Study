SELECT user_id, nickname, SUM(price) total_sales from used_goods_board b
inner join used_goods_user u on b.writer_id = u.user_id 
where status = 'DONE' group by b.writer_id having total_sales >= 700000 order by total_sales 