def solution(n):
    bn = bin(n).count('1')
    answer = n+1
    while(bn != bin(answer).count('1')):
        answer += 1
    return answer