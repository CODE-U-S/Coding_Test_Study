def solution(my_string):
    answer = ''
    for i in my_string:
        if i.isupper():
            answer += i.lower()
        elif i.islower():
            answer += i.upper()
    return answer