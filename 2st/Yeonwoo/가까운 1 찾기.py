def solution(arr, idx):
    answer = 0
    for i, num in enumerate(arr):
        if i>=idx and num == 1:
            answer = i
            break
        else:
            answer = -1
    return answer