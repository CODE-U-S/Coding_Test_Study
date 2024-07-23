def solution(dots):
    w = max(dots)[0] - min(dots)[0]
    h = max(dots)[1] - min(dots)[1]
    return w*h