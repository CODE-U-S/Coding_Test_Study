def solution(numbers, n):
    total = 0
    for num in numbers:
        total += num
        if total > n:  # n보다 커지는 순간 반환
            return total
