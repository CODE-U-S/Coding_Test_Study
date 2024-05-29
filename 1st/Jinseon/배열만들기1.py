def solution(n, k):
    answer = []
    for i in range(n+1):
        if i % k == 0:
            answer.append(i)
    answer.pop(0)
    return answer
