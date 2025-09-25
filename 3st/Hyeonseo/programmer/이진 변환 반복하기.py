def solution(s):
    cnt = 0
    zero = 0

    while s != "1":
        zero += s.count("0")
        s = bin(len(s.replace("0", "")))[2:]
        cnt += 1

    return [cnt, zero]
