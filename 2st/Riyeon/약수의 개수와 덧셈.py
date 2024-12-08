def solution(left, right):
    answer = 0
    for i in range(left, right+1):
        num = len([n for n in range(1, i+1) if i % n == 0])
        answer += i if num%2==0 else -1*i
    return answer