def solution(hp):
    answer = 0
    answer = hp//5+(hp%5)//3+((hp%5)%3)//1
    return answer