def solution(strArr):
    answer = []
    
    for idx, str in enumerate(strArr):
        if idx % 2 == 0:
            answer.append(str.lower())
        else:
            answer.append(str.upper())
    
    return answer
