def solution(babbling):
    answer = 0
    li = ['aya', 'ye', 'woo', 'ma']
    for b in babbling:
        for l in li:
            b = b.replace(l, '*')
        b = b.replace('*', '')
        if len(b) == 0:
            answer += 1
    return answer