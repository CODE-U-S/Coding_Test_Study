def solution(n):
    answer = []
    for i in range(n):
        answer.append([])
        for j in range(n):
            answer[i].append(0)
            if i==j:
                answer[i][j]=1
    return answer