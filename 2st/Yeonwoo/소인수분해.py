def solution(n):
    answer = []
    temp = []
    for i in range(1,n+1):
        if n%i==0:
            temp.append(n//i)
    temp.sort()
    for j in temp:
        cnt = 0
        for k in range(1,j+1):
            if j%k==0:
                cnt+=1
        if cnt==2:
            answer.append(j)
    return answer