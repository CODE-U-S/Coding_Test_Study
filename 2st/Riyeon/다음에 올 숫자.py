def solution(common):
    answer = common[-1]
    if common[-1] - common[-2] == common[-2]-common[-3]:
        answer += common[-1] - common[-2]
    else:
        answer *= common[-1] / common[-2]
    return answer