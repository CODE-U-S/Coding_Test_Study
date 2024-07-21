def solution(my_string, num1, num2):
    li = list(my_string)
    li[num1], li[num2] = li[num2], li[num1]
    return ''.join(li)