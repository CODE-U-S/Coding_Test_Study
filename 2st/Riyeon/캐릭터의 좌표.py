def solution(keyinput, board):
    answer = [0, 0]
    x = board[0]//2
    y = board[1]//2
    for i in keyinput:
        if i=='left' and abs(answer[0]-1)<=x:
            answer[0] -= 1
        elif i=='right' and abs(answer[0]+1)<=x:
            answer[0] += 1
        elif i=='up' and abs(answer[1]+1)<=y:
            answer[1] += 1
        elif i=='down' and abs(answer[1]-1)<=y:
            answer[1] -= 1
    return answer