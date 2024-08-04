def solution(myString):
    answer = ''
    for i in myString:
        if i=='a' or i == 'A':
            answer += i.upper()
        else:
            answer += i.lower()
    return answer