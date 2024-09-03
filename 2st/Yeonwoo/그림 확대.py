def solution(picture, k):
    answer = []
    temp = ''
    for i in picture:
        temp = i
        temp2 = ''
        for j in temp:
            temp2 += j*k
        for f in range(k):
            answer.append(temp2)
    return answer