def solution(n):
    answer = set()
    for i in range(2, n+1):
        if n%i==0:
            cnt=0
            for j in range(2, i+1):
                if i%j == 0:
                    cnt+=1
            if cnt ==1:
                answer.add(i)
    answer = list(answer)
    answer.sort()
    return answer