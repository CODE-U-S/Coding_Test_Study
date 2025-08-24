import math

def solution(number, limit, power):
    answer = 0
    
    for num in range(1, number + 1):
        div = 0
        for i in range(1, int(math.isqrt(num)) + 1):
            if num % i == 0:
                if i == num // i: 
                    div += 1
                else:
                    div += 2      
                    
        if div > limit:
            answer += power
        else:
            answer += div
            
    return answer