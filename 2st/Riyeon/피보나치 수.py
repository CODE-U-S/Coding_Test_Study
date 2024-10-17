def solution(n):
    f=0
    s=1
    for i in range(2, n+1):
        temp = f
        f = s
        s += temp
    return s%1234567