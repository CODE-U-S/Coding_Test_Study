def solution(x):
    sum = 0
    for i in str(x):
        sum += int(i)
    return True if x%sum == 0 else False