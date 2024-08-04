def solution(a, b):
    answer = 0
    str_a_b = str(a)+str(b)
    if 2*a*b > int(str_a_b):
        answer = 2*a*b
    elif 2*a*b == int(str_a_b):
        answer = str_a_b
    elif 2*a*b < int(str_a_b):
        answer = int(str_a_b)
    return answer