def solution(arr, flag):
    answer = []
    temp = []
    for i, tf in enumerate(flag):
        if tf==True:
            for j in range(1,arr[i]*2+1):
                answer.append(arr[i])
        else:
            answer = answer[:-arr[i]]
    
    return answer