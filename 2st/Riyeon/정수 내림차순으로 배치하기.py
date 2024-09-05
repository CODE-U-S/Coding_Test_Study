def solution(n):
    li = [i for i in str(n)]
    li.sort(reverse=True)
    return int("".join(li))