def solution(myString):
    answer = ''
    for i in range(len(myString)):
        answer += 'l' if myString[i] < 'l' else myString[i]
    return answer