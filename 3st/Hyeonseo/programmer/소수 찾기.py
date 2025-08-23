from itertools import permutations
import math

def solution(numbers):
    num_set = set()

    for k in range(1, len(numbers)+1):
        for p in permutations(numbers, k):
            num = int(''.join(p))
            num_set.add(num) 
    def is_prime(n):
        if n < 2:
            return False
        for i in range(2, int(math.sqrt(n))+1):
            if n % i == 0:
                return False
        return True

    answer = sum(1 for n in num_set if is_prime(n))
    
    return answer
