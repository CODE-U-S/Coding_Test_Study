def solution(num_list):
    answer = 0
    for n in num_list:
        while n > 1:  # n이 1이 될 때까지 반복
            if n % 2 == 0:  # 짝수일 경우
                n //= 2
            else:  # 홀수일 경우
                n = (n - 1) // 2
            answer += 1  # 연산 횟수 추가
    return answer
