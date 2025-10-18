def solution(myString):
    parts = myString.split('x')     
    answer = [len(p) for p in parts] 
    return answer
