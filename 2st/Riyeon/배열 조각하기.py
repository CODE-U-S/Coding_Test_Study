def solution(arr, query):
    for i in range(len(query)):
        if i%2==0:
            arr = arr[:query[i]+1]
        else:
            arr = arr[query[i]:]
    return arr