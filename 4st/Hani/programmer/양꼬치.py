def solution(n, k):
    answer = 0
    drink = (n//10) * 2000
    answer = ((n*12000) + (k*2000)) - drink
    return answer