def solution(array, n):
    answer = 0
    num = []
    temp = list(set(array))
    for i in temp:
        num.append(abs(n-i))
    answer = temp[num.index(min(num))]
    return answer