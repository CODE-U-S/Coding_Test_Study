def solution(my_string, is_suffix):
    answer = 0
    for i in range(0, len(my_string)):
        if my_string[i:] == is_suffix:
            answer = 1
    return answer