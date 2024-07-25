def solution(score):
    answer = []
    li = []
    for i, j in score:
        li.append((i+j)/2)
    sort = sorted(li, reverse=True)
    for i in li:
        answer.append(sort.index(i)+1)
    return answer