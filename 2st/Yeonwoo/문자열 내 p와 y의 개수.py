def solution(s):
    answer = True
    pPcount = 0
    yYcount = 0
    for py in s:
        if py=='p' or py == 'P':
            pPcount += 1
        elif py=='y' or py == 'Y':
            yYcount += 1
    if pPcount == yYcount:
        answer = True
    elif pPcount != yYcount:
        answer = False
            
    
    # [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    #print('Hello Python')

    return answer