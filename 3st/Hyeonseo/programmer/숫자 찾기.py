def solution(num, k):
    if str(num).find(str(k)) == -1 :
        return -1
    return str(num).find(str(k)) + 1