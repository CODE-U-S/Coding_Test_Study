def solution(rank, attendance):
    answer = 0
    li = []
    for i in range(len(rank)):
        if attendance[i] == True:
            li.append(rank[i])
    li.sort()
    n = 1
    for i in [2, 1, 0]:
        for r in range(len(rank)):
            if li[i] == rank[r]:
                answer += n*r
        n*=100
    return answer