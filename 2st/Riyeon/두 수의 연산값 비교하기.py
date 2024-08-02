def solution(a, b):
    answer = int(str(a) + str(b))
    if answer < (2*a*b):
        answer = 2*a*b
    return answer