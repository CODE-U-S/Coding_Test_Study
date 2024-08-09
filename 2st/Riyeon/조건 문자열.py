def solution(ineq, eq, n, m):
    answer = 0
    if ineq == '<':
        if eq == '=':
            answer = 1 if n <= m else 0
        else:
            answer = 1 if n < m else 0
    elif eq == '=':
        answer = 1 if n >= m else 0
    else:
        answer = 1 if n > m else 0
    return answer