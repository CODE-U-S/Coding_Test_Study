def solution(board):
    answer = 0
    n = len(board)
    bx = [1, 1, 1, 0, 0, -1, -1, -1]
    by = [1, 0, -1, 1, -1, 1, 0, -1]
    bom = []
    for x in range(n):
        for y in range(n):
            if board[x][y] == 1:
                bom.append((x, y))
    
    for i, j in bom:
        for k in range(8):
            x = i + bx[k]
            y = j + by[k]
            if 0 <= x < n and 0 <= y < n:
                board[x][y] = 1
    
    for i in board:
        answer += i.count(0)
    return answer