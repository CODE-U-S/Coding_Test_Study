def solution(arr):
    answer = []
    n = max(len(arr), len(arr[0]))
    
    for i in range(n):
        li = []
        for j in range(n):
            if j < len(arr[0]) and i < len(arr):
                li.append(arr[i][j])
            else:
                li.append(0)
        answer.append(li)
    return answer