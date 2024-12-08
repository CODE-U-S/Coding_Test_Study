def solution(my_string):
    li = list(my_string.lower())
    li.sort()
    return ''.join(li)