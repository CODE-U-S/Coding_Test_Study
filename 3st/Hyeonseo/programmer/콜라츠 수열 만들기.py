def solution(n):
    answer = [n]   # 처음 시작값 넣기
    
    while n != 1:  # 1이 될 때까지 반복
        if n % 2 == 0:   # 짝수라면
            n = n // 2
        else:            # 홀수라면
            n = 3 * n + 1
        answer.append(n) # 다음 값 추가
    
    return answer
