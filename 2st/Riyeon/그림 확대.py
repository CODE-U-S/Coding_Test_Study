def solution(picture, k):
    answer = []
    for pic in picture:
        str=''
        for i in pic:
            for n in range(k):
                str += i
        for n in range(k):
            answer.append(str)
    return answer