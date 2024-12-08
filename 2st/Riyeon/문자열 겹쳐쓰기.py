def solution(my_string, overwrite_string, s):
    li = list(my_string)
    for i in overwrite_string:
        li[s] = i
        s += 1
    return ''.join(li)