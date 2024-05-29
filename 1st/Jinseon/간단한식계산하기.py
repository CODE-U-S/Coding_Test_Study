def solution(binomial):
    answer = 0
    str1, op, str2 = binomial.split(" ")
    if op == '+':
        return int(str1) + int(str2)
    elif op == '-':
        return int(str1) - int(str2)
    else:
        return int(str1) * int(str2)
