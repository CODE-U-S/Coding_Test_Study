def solution(arr):
    answer = []
    answer.append(arr[0])
    front = arr[0]
    for i in range(1,len(arr)):
        if front != arr[i]:
            answer.append(arr[i])
        front = arr[i]
    return answer