def solution(arr1, arr2):
    answer = 0
    num1 = 0
    num2 = 0
    for i in range(len(arr1)) :
        num1 += arr1[i]
    for j in range(len(arr2)) :
        num2 += arr2[j]
    if len(arr1) > len(arr2) :
        answer = 1
    elif len(arr1) < len(arr2) :
        answer = -1
    else :
        if num1 > num2 : answer = 1
        elif num1 < num2 : answer = -1
        else : answer = 0
    return answer