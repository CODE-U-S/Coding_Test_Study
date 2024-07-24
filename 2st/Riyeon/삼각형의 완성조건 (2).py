def solution(sides):
    answer = 0
    maxs, mins = max(sides), min(sides)
    n = 1
    while n < sum(sides):
        if mins + n > maxs:
            answer += 1
        elif maxs >= n and n > sum(sides):
            answer += 1
        n += 1
    return answer