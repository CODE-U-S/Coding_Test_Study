def solution(myString):
    answer = []
    for l in myString.split('x'):
        answer.append(len(l))
    return answer