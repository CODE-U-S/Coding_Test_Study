def solution(my_string, n):
    li = list(my_string)
    answer = ''
    for i in li:
        for j in range(0, n):
            answer += i
    return answer