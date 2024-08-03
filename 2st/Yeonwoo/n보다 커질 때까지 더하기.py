def solution(numbers, n):
    answer = 0
    for i in numbers:
        answer += i
        if answer > n:
            break
    return answer