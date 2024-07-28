def solution(num, total):
    answer = [total-1]
    while sum(answer) != total:
        answer.append(answer[-1]-1)
        if len(answer) > num:
            answer.pop(0)
    answer.sort()
    return answer