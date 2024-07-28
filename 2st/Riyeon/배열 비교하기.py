def solution(arr1, arr2):
    answer = 0
    if len(arr1) == len(arr2):
        if sum(arr1) != sum(arr2):
            answer = 1 if sum(arr1) > sum(arr2) else -1
    else:
        answer = 1 if len(arr1) > len(arr2) else -1
    return answer