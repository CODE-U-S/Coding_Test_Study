def solution(strArr):
    answer = []
    temp = []
    for i in strArr:
        temp.append(len(i))
    for i in set(temp):
        answer.append(temp.count(i))
    answer= max(answer)
    return answer