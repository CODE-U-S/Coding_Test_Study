def solution(my_string):
    li = my_string.split(' ')
    answer = int(li[0])
    for i in range(1, len(li), 2):
        if li[i] == '+':
            answer += int(li[i+1])
        else:
            answer -= int(li[i+1])
    return answer