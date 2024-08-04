def solution(n, k):
    answer = []
    for i in range(1, n+1):
        if i%k==0:
            answer.append(i)
    return answer