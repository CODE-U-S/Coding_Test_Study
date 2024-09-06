def solution(n):
    i = 1
    while(i*i <= n):
        i+=1
    if pow(i-1, 2) != n:
        return -1
    return i*i