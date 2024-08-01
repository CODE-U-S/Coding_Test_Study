def solution(n, k):
    return list(i for i in range(1, n+1) if i%k == 0)