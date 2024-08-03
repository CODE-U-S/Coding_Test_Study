def solution(i, j, k):
    answer = 0
    str_ = ''
    for t in range(i, j+1):
        str_ += str(t)
    for q in str_:
        if q == str(k):
            answer += 1
    return answer