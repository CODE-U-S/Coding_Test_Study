def solution(str_list):
    answer = []
    for i in range(len(str_list)):
        if str_list[i]=='l':
            answer = str_list[:i]
            break
        elif str_list[i]=='r':
            answer = str_list[i+1:]
            break
    return answer