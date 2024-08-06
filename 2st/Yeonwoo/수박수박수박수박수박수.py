def solution(n):
    answer = ''
    su = '수'
    pack = '박'
    for i in range(1,n+1):
        if i%2==1:
            answer+=su
        else:
            answer+=pack
    return answer