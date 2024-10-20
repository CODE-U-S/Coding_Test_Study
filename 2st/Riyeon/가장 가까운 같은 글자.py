def solution(s):
    answer = []
    temp = []
    for i in s:
        if i not in temp:
            answer.append(-1)
            temp.append(i)
        else:
            temp.append(i)
            for j in range(1,len(temp)):
                if temp[len(temp)-1-j] == i:
                    answer.append(j)
                    break
    return answer