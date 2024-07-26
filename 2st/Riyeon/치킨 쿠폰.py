def solution(chicken):
    answer = 0
    while chicken >= 10:
        n = chicken // 10
        answer += n
        chicken = chicken % 10 + n
    return answer