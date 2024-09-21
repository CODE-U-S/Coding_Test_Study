a = input()
b = input().split()
mx = []
for i in b:
    mx.append(int(i))
print(min(mx), max(mx))