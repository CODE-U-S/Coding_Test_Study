def solution(n):
    answer = 0
    for i in range(1, n+1):
        sum = 0
        while sum < n:
            sum += i
            i += 1
        if sum == n:
            answer += 1
    return answer