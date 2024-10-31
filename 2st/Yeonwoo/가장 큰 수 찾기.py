def solution(array):
    answer = [0]*2
    answer[0] = max(array)
    answer[1] = array.index(answer[0])
    return answer