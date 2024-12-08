def solution(a, b):
    a = str(a)
    b = str(b)
    answer = int(a+b)
    if answer < int(b+a):
        answer = int(b+a)
    return answer