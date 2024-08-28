def solution(array):
    answer = 0
    max_ = 0
    temp2 = []
    temp = set(array)
    for i in temp:
        if array.count(i) > max_:
            max_ = array.count(i)
            answer = i
        elif array.count(i) == max_:
            answer = -1
    return answer