def solution(my_string):
    answer = ''
    temp = ''
    for i in my_string:
        if i in answer:
            temp += i
        else:
            answer += i
    return answer