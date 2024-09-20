temp = []
for i in range(9):
    a = int(input())
    temp.append(a)
su = max(temp)
print(su)
print(temp.index(su)+1)