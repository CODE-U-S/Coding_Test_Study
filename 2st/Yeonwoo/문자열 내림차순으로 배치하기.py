def solution(s):
    answer = ''
    s_list = list(s)
    s_list.sort()
    s_list.reverse()
    answer = ''.join(s_list)
    return answer