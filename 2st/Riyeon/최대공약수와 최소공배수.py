from math import gcd
def solution(n, m):
    answer = gcd(n, m)  # 최소공배수
    return [answer, (n*m)//answer]