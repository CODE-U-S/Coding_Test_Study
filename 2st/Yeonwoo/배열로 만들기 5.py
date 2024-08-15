def solution(intStrs, k, s, l):
    answer = []
    temp = []
    for i in intStrs:
        temp.append(i[s:s+l])
    for j in temp:
        if int(j) > k:
            answer.append(int(j))
    return answer