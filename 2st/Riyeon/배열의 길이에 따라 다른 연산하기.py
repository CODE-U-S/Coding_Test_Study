def solution(arr, n):
    arrlen = len(arr) 
    for i in range(len(arr)):
        if i % 2 == 0 and arrlen % 2 == 1:
            arr[i] += n
        elif i % 2 == 1 and arrlen % 2 == 0:
            arr[i] += n
    return arr