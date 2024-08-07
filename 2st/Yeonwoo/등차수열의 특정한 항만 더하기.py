def solution(a, d, included):
    answer = 0
    temp = []
    for i in range(1,len(included)+1):
        su = a+(i-1)*d
        temp.append(su)
    for inx, j in enumerate(included):
        if j==True:
            answer += temp[inx]
    return answer