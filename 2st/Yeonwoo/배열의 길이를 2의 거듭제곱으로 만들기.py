def solution(arr):
    count = 0 
    length = len(arr)
    while length > 1:
        length = length / 2
        count += 1
    return arr + [0] * (2 ** count - len(arr))