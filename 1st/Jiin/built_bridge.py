# c로 풀다가 30! 못 하겠어서 python으로 변경

def factorial(n):
    if n == 1 or n == 0:
        return 1
    return n * factorial(n - 1)

def combination(entire, items):
    return int(factorial(entire) / (factorial(entire - items) * factorial(items)))

limit = int(input())

for _ in range(limit):
    n, m = map(int, input().split())
    print(combination(m, n))
