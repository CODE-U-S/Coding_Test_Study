num = int(input())
for _ in range(num):
    num2, str_ = input().split()
    st = ''
    for i in str_:
        for _ in range(int(num2)):
            st+=i
    print(st)