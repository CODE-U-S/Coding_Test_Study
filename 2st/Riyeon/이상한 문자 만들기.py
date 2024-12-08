def solution(s):
    answer = []
    for li in s.split(' '):
        st = ''
        for i in range(len(li)):
            st += li[i].upper() if i%2 == 0 else li[i].lower()
        answer.append(st)
    return ' '.join(answer)