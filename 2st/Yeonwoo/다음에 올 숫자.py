def solution(common):
    answer = 0
    a = common[0]
    d = 0
    r = 0
    if common[1]-common[0] == common[2]-common[1]:
        d = common[1]-common[0]
        answer = common[-1]+d
    else:
        r = common[1]/common[0]
        answer = common[-1]*r
    return answer