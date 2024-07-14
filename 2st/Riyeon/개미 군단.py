def solution(hp):
    answer=0
    for i in range(5, 0, -2):
        answer += hp//i
        hp%=i
    return answer