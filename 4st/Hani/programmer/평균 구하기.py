def solution(arr):
    answer = 0.0
    temp = 0.0
    for i in range(len(arr)) :
        temp += arr[i]
    answer = temp / len(arr)
    return answer