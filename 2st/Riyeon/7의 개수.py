def solution(array):
    answer = 0
    for i in array:
        for j in str(i):
            if j=='7':
                answer += 1
    return answer