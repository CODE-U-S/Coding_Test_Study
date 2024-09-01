def solution(n, m):
    answer = []
    temp1 = []
    temp2 = []
    temp3 = []
    for i in range(1,n+1):
        if n%i==0:
            temp1.append(i)
    for i in range(1, m+1):
        if m%i==0:
            temp2.append(i)
    if min(n,m)<=max(n,m):
        for i in temp1:
            for j in temp2:
                if i==j:
                    temp3.append(j)
    temp3.sort(reverse=True)
    answer.append(temp3[0])
    answer.append((n*m)//temp3[0])
    return answer