def solution(n):
    answer = ''

    while n > 0:			
        n, re = divmod(n,3)	
        answer += str(re)
    return int(answer, 3)