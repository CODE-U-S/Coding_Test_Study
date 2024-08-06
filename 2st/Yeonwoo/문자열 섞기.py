def solution(str1, str2):
    L1 = []
    L2 = []
    L3 = []
    L1 = list(str1)
    L2 = list(str2)
    for i in range(0,len(str1)):
        L3.append(L1[i])
        L3.append(L2[i])
    answer = ''.join(L3)
    return answer