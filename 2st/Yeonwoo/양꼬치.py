def solution(n, k):
    answer = 0
    if n >= 10:
        drink_price = (k-n//10)*2000
    else:
        drink_price = k*2000
    answer = n*12000 + drink_price
    return answer