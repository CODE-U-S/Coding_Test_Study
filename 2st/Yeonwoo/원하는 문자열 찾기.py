def solution(myString, pat):
    answer = 0
    if pat.lower() in myString.lower():
        answer = 1
    else:
        answer = 0
    return answer