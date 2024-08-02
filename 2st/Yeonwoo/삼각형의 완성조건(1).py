def solution(sides):
    answer = 0
    mx = max(sides)
    su = sum(sides)-mx
    if mx < su:
        answer = 1
    else:
        answer = 2
    return answer