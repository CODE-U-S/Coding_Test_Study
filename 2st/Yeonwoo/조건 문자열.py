def solution(ineq, eq, n, m):
    answer = 0
    if ineq == '>' and eq == '=' and n >= m:
        answer = 1
    elif ineq == '<' and eq == '=' and n <= m:
        answer = 1
    elif ineq == '>' and eq == '!' and n > m:
        answer = 1
    if ineq == '<' and eq == '!' and n < m:
        answer = 1
    return answer