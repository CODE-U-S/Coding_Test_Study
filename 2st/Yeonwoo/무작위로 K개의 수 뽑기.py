def solution(arr, k):
    answer = []
    se = set()
    for i in arr:
        if i not in se:
            se.add(i)
            answer.append(i)
    if len(answer) >= k:
        answer = answer[:k]
    else:
        answer = answer[:]
        for i in range(k-len(answer)):
            answer.append(-1)
    return answer