def solution(box, n):
    answer = 0
    a = box[0]//n
    b = box[1]//n
    c = box[2]//n
    answer = a*b*c
    return answer