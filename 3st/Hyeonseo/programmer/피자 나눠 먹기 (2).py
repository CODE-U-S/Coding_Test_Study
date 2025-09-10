import math

def solution(n):
    lcm = (6 * n) // math.gcd(6, n)  # 최소공배수 구하기
    return lcm // 6
