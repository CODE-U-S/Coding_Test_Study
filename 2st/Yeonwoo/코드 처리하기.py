def solution(code):
    answer = ''
    mode = 0
    for i, co in enumerate(code):
        if mode == 0:
            if co!='1' and i%2==0:
                answer += co
            elif co=='1':
                mode = 1
        else:
            if co!='1' and i%2==1:
                answer += co
            elif co=='1':
                mode = 0
    if answer == '':
        answer = 'EMPTY'
    return answer