-- 코드를 작성해주세요
SELECT COUNT(genotype) count
FROM ecoli_data
WHERE SUBSTR(LPAD(BIN(CONVERT(genotype, BINARY)), 32, 0), -3) IN ('101', '001', '100');
