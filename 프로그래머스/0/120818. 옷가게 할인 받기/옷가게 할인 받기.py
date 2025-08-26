def solution(price):
    if price >= 500000:
        price *= 0.8   # 20% 할인
    elif price >= 300000:
        price *= 0.9   # 10% 할인
    elif price >= 100000:
        price *= 0.95  # 5% 할인
    
    return int(price)
