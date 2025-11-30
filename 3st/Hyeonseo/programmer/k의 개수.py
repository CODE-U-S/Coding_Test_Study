def solution(i, j, k):
    answer = 0
    target = str(k)
    
    for num in range(i, j + 1):
        answer += str(num).count(target)
    
    return answer
