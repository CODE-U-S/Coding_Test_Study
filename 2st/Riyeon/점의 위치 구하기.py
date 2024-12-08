def solution(dot):
    x, y = int(dot[0]), int(dot[-1])
    if x > 0:
        if y > 0:
            return 1
        else:
            return 4
    elif y > 0:
        return 2
    else:
        return 3