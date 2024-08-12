def solution(my_strings, parts):
    answer = ''
    for i in range(len(parts)):
        answer += my_strings[i][parts[i][0]:parts[i][1]+1]
    return answer