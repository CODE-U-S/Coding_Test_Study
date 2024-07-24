def solution(dots):
    answer = 0
    if func(dots[0], dots[1]) == func(dots[2], dots[3]):
        answer = 1
    if func(dots[0], dots[2]) == func(dots[1], dots[3]):
        answer = 1
    if func(dots[0], dots[3]) == func(dots[1], dots[2]):
        answer = 1
    return answer

def func(d1, d2):
    return (d2[1]-d1[1]) / (d2[0]-d1[0])