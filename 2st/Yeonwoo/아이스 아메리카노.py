def solution(money):
    answer = [0]*2
    answer[0] = money//5500
    answer[1] = money%5500
    return answer