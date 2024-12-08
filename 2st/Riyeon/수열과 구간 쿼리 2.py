def solution(arr, queries):
    answer = []
    for s, e, k in queries:
        n = -1
        for i in range(s, e+1):
            if arr[i] > k and ( n > arr[i] or n == -1):
                n = arr[i]
        answer.append(n)
    return answer