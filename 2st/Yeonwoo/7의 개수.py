def solution(array):
    answer = 0
    str_ = ''
    for i in array:
        str_ += str(i)
    for j in str_:
        if j == "7":
            answer += 1
    return answer