def solution(my_string, is_prefix):
    answer = 0
    if my_string.startswith(is_prefix) == True:
        answer = 1
    else:
        answer = 0
    return answer