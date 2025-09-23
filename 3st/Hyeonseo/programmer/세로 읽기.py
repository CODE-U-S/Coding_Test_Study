def solution(my_string, m, c):
    answer = ""
    for row in range(len(my_string) // m):
        answer += my_string[row * m + (c - 1)]
    return answer
