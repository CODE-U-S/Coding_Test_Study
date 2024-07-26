def solution(lines):
    s1 = set()
    s2 = set()
    s3 = set()
    for i in range(lines[0][0], lines[0][1]):
        s1.add(i)
    for i in range(lines[1][0], lines[1][1]):
        s2.add(i)
    for i in range(lines[2][0], lines[2][1]):
        s3.add(i)
    return len((s1 & s2) | (s1 & s3) | (s2 & s3))