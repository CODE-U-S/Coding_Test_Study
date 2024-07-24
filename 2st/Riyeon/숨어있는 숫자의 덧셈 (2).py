def solution(my_string):
    for i in my_string:
        if not i.isdigit():
            my_string = my_string.replace(i, ' ')
    li = my_string.split(' ')
    answer = 0
    for i in li:
        if len(i) != 0:
            answer += int(i)
    return answer