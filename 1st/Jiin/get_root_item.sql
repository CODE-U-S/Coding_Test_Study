-- 코드를 작성해주세요
SELECT item_tree.item_id, item_name
FROM item_info JOIN item_tree ON item_info.item_id = item_tree.item_id
WHERE parent_item_id IS NULL
ORDER BY item_id;
