def solution(n):
    # n x n 크기의 0으로 채워진 2차원 배열 초기화
    array = [[0] * n for _ in range(n)]
    
    # 시작 숫자와 방향 (오른쪽, 아래, 왼쪽, 위)
    dx = [0, 1, 0, -1]  # 행 이동
    dy = [1, 0, -1, 0]  # 열 이동
    x, y = 0, 0  # 시작 위치
    direction = 0  # 현재 방향 인덱스
    num = 1

    for _ in range(n * n):
        array[x][y] = num
        num += 1

        # 다음 위치 계산
        nx = x + dx[direction]
        ny = y + dy[direction]

        # 다음 위치가 범위를 벗어나거나 이미 채워졌으면 방향 전환
        if nx < 0 or nx >= n or ny < 0 or ny >= n or array[nx][ny] != 0:
            direction = (direction + 1) % 4  # 방향 변경
            nx = x + dx[direction]
            ny = y + dy[direction]

        x, y = nx, ny

    return array
