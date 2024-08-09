def solution(my_string, s, e):
    answer = ''
    temp = []
    temp = list(my_string[s:e+1])
    temp.reverse()
    answer = my_string[:s] + ''.join(temp) + my_string[e+1:]
    return answer