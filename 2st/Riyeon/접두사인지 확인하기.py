def solution(my_string, is_prefix):
    answer = 0
    for i in range(1, len(my_string)):
        if my_string[:i] == is_prefix:
            answer = 1
    return answer