def solution(quiz):
    answer = []
    for i in quiz:
        li = i.split(' ')
        num = 0
        if li[1] == '+':
            num = int(li[0]) + int(li[2])
        else:
            num = int(li[0]) - int(li[2])
        if num == int(li[4]):
            answer.append('O')
        else:
            answer.append('X')
    return answer