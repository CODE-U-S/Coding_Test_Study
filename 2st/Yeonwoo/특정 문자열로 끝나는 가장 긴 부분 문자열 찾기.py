def solution(myString, pat):
    answer = ''
    answer = myString[:myString.rfind(pat)+len(pat)]
    return answer