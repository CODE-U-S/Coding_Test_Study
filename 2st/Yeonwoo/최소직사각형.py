def solution(sizes):
    answer = 0
    temp = []
    temp_max1 = []
    temp_max2 = []
    for i in range(len(sizes)):
        temp.append([])
        for j in range(len(sizes[0])):
            temp[i].append(sizes[i][j])
        if temp[i][0] > temp[i][1]:
            temp[i][0],temp[i][1] = temp[i][1], temp[i][0]
    for i in range(len(sizes)):
        temp_max1.append(temp[i][0])
    for i in range(len(sizes)):
        temp_max2.append(temp[i][1])
    answer = max(temp_max1)*max(temp_max2)
    return answer