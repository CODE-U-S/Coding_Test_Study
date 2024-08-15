def solution(arr):
    answer = 0
    cnt = 0
    for i in range(len(arr)):
        for j in range(len(arr[0])):
            if arr[i][j]==arr[j][i]:
                cnt += 1
    if cnt==len(arr)*len(arr[0]):
        answer = 1
    return answer