def solution(a, b):
    answer = 0
    str_a_b = str(a)+str(b)
    str_b_a = str(b)+str(a)
    if int(str_a_b) > int(str_b_a):
        answer = int(str_a_b)
    elif int(str_a_b) < int(str_b_a):
        answer = int(str_b_a)
    elif int(str_a_b) == int(str_b_a):
        answer = int(str_a_b)
        
    return answer