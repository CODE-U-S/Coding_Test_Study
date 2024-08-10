def solution(my_string, indices):
    answer = ''
    temp = ''
    for i, str_ in enumerate(my_string):
        if i in indices:
            temp += str_
        else:
            answer += str_
    return answer