def solution(s):
    answer = list(s)
    answer.sort(reverse = True)
    return ''.join(answer)