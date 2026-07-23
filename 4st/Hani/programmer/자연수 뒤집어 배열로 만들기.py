def solution(n):
    answer = []
    
    answer = str(n)
    answer = answer[::-1]
    answer = list(answer)
    
    for i in range(len(answer)) :
        answer[i] = int(answer[i])
    return answer