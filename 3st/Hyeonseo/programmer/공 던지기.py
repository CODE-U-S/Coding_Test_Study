def solution(numbers, k):
    return numbers[(k-1) * 2 % len(numbers)]