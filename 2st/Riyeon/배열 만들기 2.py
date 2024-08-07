def solution(l, r):
    answer = []
    for i in range(l, r+1):
        s = str(i).replace('0', '')
        s = s.replace('5', '')
        if s == '':
            answer.append(i)
    return answer if len(answer) != 0 else [-1]