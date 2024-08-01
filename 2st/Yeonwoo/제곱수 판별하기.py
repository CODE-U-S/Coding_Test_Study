def solution(n):
    answer = 0
    sqrt = n**(1/2)
    if sqrt%1==0:
        answer = 1
    else:
        answer = 2
    return answer