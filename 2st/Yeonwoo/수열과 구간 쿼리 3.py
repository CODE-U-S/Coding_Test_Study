def solution(arr, queries):
    answer = []
    for i in queries:
        arr[i[0]], arr[i[1]] = arr[i[1]], arr[i[0]]
    answer = arr
    return answer