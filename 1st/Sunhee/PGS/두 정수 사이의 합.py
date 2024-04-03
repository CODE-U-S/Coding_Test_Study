def solution(a, b):
    if a < b :
        return sum(list(range(a, b+1)))
    else:
        return sum(list(range(b, a+1)))