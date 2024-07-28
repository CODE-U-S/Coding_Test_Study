def solution(myString, pat):
    myString = myString.replace('A', '0')
    myString = myString.replace('B', 'A')
    myString = myString.replace('0', 'B')
    return 1 if pat in myString else 0