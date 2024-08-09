def solution(myString):
    answer = []
    temp = myString.split('x')
    for i in temp:
        if i != "":
            answer.append(i)
    answer.sort()
    return answer