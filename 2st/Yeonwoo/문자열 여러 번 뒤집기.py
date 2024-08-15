def solution(my_string, queries):
    answer = ''
    answer = my_string
    for start, end in queries:
        answer = answer[:start] + answer[start:end+1][::-1] + answer[end+1:]
    return answer