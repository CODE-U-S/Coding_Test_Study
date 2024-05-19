def solution(arr):
    answer = arr;
    for i in range(len(arr)):
        if arr[i] >= 50:
            answer[i] = arr[i] / 2 if arr[i] % 2 == 0 else arr[i]
        else:
            answer[i] = arr[i] * 2 if arr[i] % 2 == 1 else arr[i]
    return answer
