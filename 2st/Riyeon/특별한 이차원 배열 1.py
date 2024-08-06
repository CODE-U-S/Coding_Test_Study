def solution(n):
    answer = []
    for i in range(n):
        li = []
        for j in range(n):
            li.append(1 if i == j else 0)
        answer.append(li)
    return answer