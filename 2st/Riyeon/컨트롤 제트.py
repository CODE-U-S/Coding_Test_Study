def solution(s):
    answer = []
    for i in s.split(' '):
        if i == 'Z':
            answer.pop()
        else:
            answer.append(int(i))
    return sum(answer)