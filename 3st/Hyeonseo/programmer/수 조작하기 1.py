def solution(n, control):
    move = {'w': 1, 's': -1, 'd': 10, 'a': -10}
    for c in control:
        n += move[c]
    return n