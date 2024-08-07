def solution(n):
    answer = 0
    if n == 1:
        answer = 0
    else:
        while n!=1:
            if n%2==0:
                n = n//2
            else:
                n = n*3+1
            answer += 1
    if answer > 500:
        answer = -1
    return answer