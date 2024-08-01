def solution(n, control):
    answer = n
    for i in control:
        if i == 'w':
            answer += 1
        elif i == 's':
            answer -= 1
        elif i == 'd':
            answer += 10
        else:
            answer -= 10
    return answer