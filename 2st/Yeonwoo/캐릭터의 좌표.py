def solution(keyinput, board):
    answer = [0,0]
    x, y = (board[0]-1)//2, (board[1]-1)//2
    for i in keyinput:
        if i=="left" and answer[0]>-x:
            answer[0]-=1
        elif i=="right" and answer[0]<x:
            answer[0]+=1
        elif i=="up" and answer[1]<y:
            answer[1]+=1
        elif i=="down" and answer[1]>-y:
            answer[1]-=1
    return answer