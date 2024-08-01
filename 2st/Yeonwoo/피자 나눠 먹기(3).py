def solution(slice, n):
    answer = 0
    if n%slice == 0:
        answer = n//slice
    elif n% slice > 0:
        answer = (n//slice)+1
    return answer