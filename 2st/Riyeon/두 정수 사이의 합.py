def solution(a, b):
    answer = [i for i in range(min(a, b), max(a,b)+1)]
    return sum(answer)