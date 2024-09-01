def solution(x, n):
    answer = []
    sum = x
    while len(answer) != n:
        answer.append(sum)
        sum += x
    return answer