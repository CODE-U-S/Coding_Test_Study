def solution(arr):
    answer = []
    if len(arr)==len(arr[0]):
        answer = arr
    elif len(arr)>len(arr[0]):
        for i in range(len(arr)):     
            answer.append(arr[i]+[0]*(len(arr)-len(arr[0])))
    elif len(arr)<len(arr[0]):
        for i in range(len(arr)):
            answer.append(arr[i])
        for j in range(len(arr[0])-len(arr)):
            answer.append([0]*len(arr[0]))
    return answer