def solution(n):
    ls = list(str(int(n)))
    ls.sort(reverse = True)
    return int("".join(ls))