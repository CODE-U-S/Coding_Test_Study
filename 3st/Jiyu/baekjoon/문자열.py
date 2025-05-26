a = []
num = int(input())

for i in range(0, num, 1):
    b = input()
    a.append(b)

for i in range(len(a)):
    print(a[i][0] + a[i][-1])