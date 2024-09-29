def solution(array, commands):
    answer = []
    temp = []
    num = []
    for i in range(len(commands)):
        temp.append(array[commands[i][0]-1:commands[i][1]])
        temp[i].sort()
        answer.append(temp[i][commands[i][2]-1])
    return answer