def solution(number, n, m):
    answer = 0
    for i in range(10) :
        if number % n == 0 and number % m == 0 :
            answer = 1
    return answer