def solution(numLog):
    answer = ''
    for i in range(1, len(numLog)):
        diff = numLog[i] - numLog[i-1]
        if diff == 1:
            answer += 'w'
        elif diff == -1:
            answer += 's'
        elif diff == 10:
            answer += 'd'
        elif diff == -10:
            answer += 'a'
    return answer
