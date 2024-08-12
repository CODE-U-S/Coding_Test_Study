def solution(q, r, code):
    answer = ''
    for i, co in enumerate(code):
        if i%q==r:
            answer += co
    return answer