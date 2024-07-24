def solution(n):
    answer = 0
    for _ in range(0, n):
        answer += 1
        while True:
            if '3' in str(answer) or answer % 3 ==0:
                answer += 1
            else:
                break
        
    return answer