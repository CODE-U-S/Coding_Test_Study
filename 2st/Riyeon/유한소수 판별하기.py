import math
def solution(a, b):
    b = b / math.gcd(a, b)  # 최대 공약수
    
    while b % 2 == 0:
        b /= 2
    while b % 5 == 0:
        b /= 5
    
    return 1 if b == 1 else 2