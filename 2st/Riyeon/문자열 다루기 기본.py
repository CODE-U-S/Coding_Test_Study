def solution(s):
    answer = True
    if len(s) == 4 or len(s) == 6:
        for i in s:
            if i.isalpha():
                answer = False
    else:
        answer = False
    return answer