def solution(arr1, arr2):
    answer = 0
    arr1_sum = 0
    arr2_sum = 0
    if len(arr1) != len(arr2):
        if len(arr1) > len(arr2):
            answer = 1
        elif len(arr1) < len(arr2):
            answer = -1
    elif len(arr1) == len(arr2):
        for i in arr1:
            arr1_sum += i
        for j in arr2:
            arr2_sum += j
        if arr1_sum > arr2_sum:
            answer = 1
        elif arr1_sum == arr2_sum:
            answer = 0
        elif arr1_sum < arr2_sum:
            answer = -1
    return answer