N = int(input())
su = list(map(int, input().split()))
num = []
for i in range(N):
    num.append(su[i])
M = max(num)
M2 = []
for j in num:
    M2.append(j/M*100)
print(sum(M2)/len(num))