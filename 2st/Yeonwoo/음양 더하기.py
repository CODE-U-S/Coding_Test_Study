def solution(absolutes, signs):
    answer = 0
    for i , tf in enumerate(signs):
        if tf==True:
            answer += absolutes[i]
        elif tf==False:
            answer -= absolutes[i]
    return answer