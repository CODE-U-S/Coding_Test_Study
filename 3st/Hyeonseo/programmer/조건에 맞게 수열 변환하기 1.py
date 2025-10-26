def solution(arr):
    answer = []
    for num in arr:
        if num >= 50 and num % 2 == 0:   # 50 이상 짝수 → 2로 나누기
            answer.append(num // 2)
        elif num < 50 and num % 2 == 1:  # 50 미만 홀수 → 2 곱하기
            answer.append(num * 2)
        else:                            # 그 외는 그대로
            answer.append(num)
    return answer
