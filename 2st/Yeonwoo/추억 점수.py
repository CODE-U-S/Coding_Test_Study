def solution(name, yearning, photo):
    answer = [] 
    for i in range(len(photo)):
        temp = 0
        for j in range(len(name)):
            if name[j] in photo[i]:
                temp += yearning[j]
        answer.append(temp)
            
    return answer