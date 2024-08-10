def solution(my_string, num1, num2):
    answer = ''
    for i, str_ in enumerate(my_string):
        if i==num1:
            answer += my_string[num2]
        elif i==num2:
            answer += my_string[num1]
        else:
            answer += str_
    return answer