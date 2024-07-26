def solution(array, n):
    answer = 0
    for num in array:
        if num == n:
            answer += 1
    return answer