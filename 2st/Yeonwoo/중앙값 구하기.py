def solution(array):
    answer = 0
    array.sort()
    answer = array[len(array)//2]
    return answer