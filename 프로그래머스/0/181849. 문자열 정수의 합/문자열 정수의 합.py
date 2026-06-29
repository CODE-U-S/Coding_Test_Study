def solution(num_str):
    answer = 0
    
    num = int(num_str)
    
    for i in range(len(num_str)) :
        answer += num % 10
        num = num // 10
    return answer