def solution(myString):
    answer = sorted(myString.split("x"))
    answer = [s for s in answer if s]
    return answer
