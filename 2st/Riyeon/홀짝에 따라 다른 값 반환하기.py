def solution(n):
    eo = 0 if n % 2 == 0 else 1
    answer = 0
    for i in range(n+1):
        if i % 2 == eo:
            if eo == 1:
                answer += i
            else:
                answer += i*i
    return answer