a = 1
b = 1
res = -1
n = int(input())
if n == 1:
	res = a
elif n == 2:
	res = b
else:
	for i in range(2, n):
		res = a + b
		a = b
		b = res
print(res)