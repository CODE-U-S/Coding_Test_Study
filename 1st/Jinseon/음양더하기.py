def solution(absolutes, signs):
    answer = 0
    for inx, i in enumerate(signs):
        if(i):
            answer += absolutes[inx]
        else:
            answer -= absolutes[inx]
    return answer
