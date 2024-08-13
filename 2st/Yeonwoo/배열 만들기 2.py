def solution(l, r):
    answer = []
    for i in range(l,r+1):
        if str(i).count('0') + str(i).count('5') == len(str(i)):
            answer.append(i)
    if answer == []:
        answer.append(-1)
    return answer