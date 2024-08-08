def solution(n):
    answer = 0
    for i in range(1, int(n**0.5)+1):
        if n%i==0:
            answer+=2
            if i*i==n:
                answer-=1
    return answer