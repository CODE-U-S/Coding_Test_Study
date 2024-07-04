def solution(slice, n):
    answer = 1
    while(slice*answer < n):
        answer += 1
    return answer