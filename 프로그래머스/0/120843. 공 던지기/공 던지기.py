def solution(numbers, k):
    answer = 0
    i = (k-1) * 2
    answer = numbers[i % len(numbers)]
    return answer