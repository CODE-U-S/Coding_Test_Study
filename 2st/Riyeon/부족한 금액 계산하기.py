def solution(price, money, count):
    answer = 0
    for i in range(1, count+1):
        answer += i*price
    if answer > money:
        return answer-money 
    return 0