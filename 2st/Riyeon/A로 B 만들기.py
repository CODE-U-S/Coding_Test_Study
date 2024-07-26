def solution(before, after):
    answer = 1
    li = list(before)
    for i in after:
        if i in li:
            li.remove(i)
        else:
            answer = 0
            break
    return answer