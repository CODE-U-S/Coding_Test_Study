def solution(participant, completion):
    answer = ''
    d = {}
    for i in participant:
        if i in d:
            d[i] += 1
        else:
            d[i] = 1
    for i in completion:
        d[i] -= 1
        if d[i] == 0:
            del d[i]
        
    for i in d.keys():
        answer = i
    return answer