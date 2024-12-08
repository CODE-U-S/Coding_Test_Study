def solution(sizes):
    a = []
    b = []
    for i, j in sizes:
        a.append(max(i, j))
        b.append(min(i, j))
    return max(a)*max(b)