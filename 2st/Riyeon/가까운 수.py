def solution(array, n):
    answer = sorted(array, key = lambda x:(abs(x-n), x))
    return answer[0]