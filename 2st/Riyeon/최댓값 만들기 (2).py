def solution(numbers):
    answer = numbers[0] * numbers[1]
    for i in range(0, len(numbers)):
        for j in range(i+1, len(numbers)):
            if answer < numbers[i]*numbers[j]:
                answer = numbers[i]*numbers[j]
    return answer