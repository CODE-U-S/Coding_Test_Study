def solution(my_string, m, c):
    answer = ''
    temp = []
    for i in range(len(my_string)//m):
        temp.append(my_string[m*i:m*(i+1)])
    for i in range(len(temp)):
        answer+= temp[i][c-1]
    return answer