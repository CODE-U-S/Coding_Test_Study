str = input()
answer = ''
for i in str:
    if i.islower()==True:
        answer+=i.upper()
    elif i.isupper()==True:
        answer+=i.lower()
print(answer)