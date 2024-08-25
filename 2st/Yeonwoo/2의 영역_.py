def solution(arr):
    answer = []
    temp = []
    for i in arr:
        temp.append(i)
    temp.reverse()
    if 2 not in arr:
        answer.append(-1)
    elif arr[-1]!=2:
        answer = arr[arr.index(2):-(temp.index(2)+1)+1]
    else:
        answer = arr
    return answer