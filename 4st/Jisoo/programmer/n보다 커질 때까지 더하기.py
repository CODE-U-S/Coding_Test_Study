def solution(numbers, n):
    answer = 0
    for num in numbers:
        answer += num
        
        if answer > n :
            return answer
        
    return answer
