str = input()
for i in str:
    if i.isupper() == True:
        print(i.lower(), end="")
    else:
        print(i.upper(), end="")
