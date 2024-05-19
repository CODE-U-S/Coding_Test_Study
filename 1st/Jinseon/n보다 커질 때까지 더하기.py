def solution(numbers, n):
    answer = 0
    for i in numbers:
        if answer > n:
            return answer
        else:
            answer+=i
    return answer
