def solution(n):
    answer = []
    answer.append(n)
    while n!=1:
        if n%2==0:
            n = n//2
        else:
            n = 3*n+1
        answer.append(n)
    return answer