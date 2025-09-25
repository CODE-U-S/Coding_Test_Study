def solution(price, money, count):
    total = price * (count * (count + 1)) // 2  # 총 필요한 금액
    answer = total - money
    return answer if answer > 0 else 0