def solution(dots):
    answer = 0
    temp_x = []
    temp_y = []
    for i in range(4):
        temp_x.append(dots[i][0])
        temp_y.append(dots[i][1])
    answer = (max(temp_x)-min(temp_x))*(max(temp_y)-min(temp_y))
    return answer