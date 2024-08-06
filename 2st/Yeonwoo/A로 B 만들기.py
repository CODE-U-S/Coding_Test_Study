def solution(before, after):
    answer = 0
    cnt = 0
    for i in before:
        if before.count(i) == after.count(i):
            cnt += 1
    if cnt == len(before):
        answer = 1
    return answer