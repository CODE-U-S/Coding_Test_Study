def solution(n, t):
    answer = n
    for i in range(0, t):
        answer *= 2
    return answer