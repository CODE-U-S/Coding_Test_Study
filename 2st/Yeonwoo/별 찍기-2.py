num = int(input())
for i in range(1,num+1):
    st = ''
    for k in range(num-i):
        st += ' '
    for j in range(i):
        st += '*'
    print(st)