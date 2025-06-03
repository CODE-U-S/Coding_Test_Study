def solution(arr, k):
    answer = []
    arr = list(dict.fromkeys(arr))
    for i in range(k):
        if(i < len(arr)):
            answer.append(arr[i])
        else:
            answer.append(-1)
    return answer