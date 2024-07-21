def solution(s):
    answer = []
    for i in set(s):
        if s.count(i) == 1:
            answer.append(i)
    answer.sort()
    return ''.join(answer)