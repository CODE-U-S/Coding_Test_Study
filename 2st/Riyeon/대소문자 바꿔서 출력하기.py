str = input()
ret = ''
for i in str:
    if i.isupper():
        ret += i.lower()
    else:
        ret += i.upper()
print(ret)
