def solution(my_string, is_suffix):
    answer = 0
    if my_string.endswith(is_suffix) == True:
        answer = 1
    else:
        answer = 0
    return answer