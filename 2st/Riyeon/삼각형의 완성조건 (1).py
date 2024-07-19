def solution(sides):
    if max(sides) < sum(sides) - max(sides):
        return 1
    else:
        return 2