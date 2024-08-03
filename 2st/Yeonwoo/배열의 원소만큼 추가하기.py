def solution(arr):
    answer = []
    arr_len = len(arr)
    for i in arr:
        for j in range(i):
            answer.append(i)
    return answer