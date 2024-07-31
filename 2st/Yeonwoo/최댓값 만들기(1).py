def solution(numbers):
    answer = 0
    numbers.sort()
    numbers_len = len(numbers)
    answer = numbers[numbers_len-1] * numbers[numbers_len-2]
    return answer