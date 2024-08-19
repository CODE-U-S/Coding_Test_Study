def solution(arr, queries):
    answer = []
    for i in queries:
        for j in range(i[0],i[1]+1):
            arr[j]+=1
    answer = arr
    return answer