from math import factorial as fac
def solution(balls, share):
    answer = 0
    n = fac(balls)
    m = fac(share)
    answer = n/(fac(balls-share)*m)
    return answer