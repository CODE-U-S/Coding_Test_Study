def solution(myString, pat):
    answer = 0
    myString_ = ''
    for i in myString:
        if i=='A':
            myString_ += i.replace('A','B')
        else:
            myString_ += i.replace('B', 'A')
    if pat in myString_:
        answer = 1
    return answer