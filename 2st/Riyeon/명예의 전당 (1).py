def solution(k, score):
    answer = []
    li = []
    for i in score:
        li.sort()
        if len(li) >= k:
            if li[0] < i:
                li.pop(0)
                li.append(i)
        else:
            li.append(i)
        answer.append(min(li))
    return answer