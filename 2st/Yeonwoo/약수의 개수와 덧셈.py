def solution(left, right):
    answer = 0
    cnt = 0
    for i in range(left, right+1):
        if int(i**(1/2))**2 == i:
            answer -= i
        else:
            answer += i
    return answer