def solution(my_string):
    answer = ''
    my_string_len = len(my_string)
    for i in range(1, my_string_len+1):
        answer += my_string[-i]
    return answer