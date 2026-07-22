def solution(n):
    answer = 0
    
    s = str(n)
    
    for i in s :
        answer += int(i)

    return answer