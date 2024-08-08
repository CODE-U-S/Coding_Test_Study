def solution(arr, k):
    answer = []
    i = 0
    while len(answer) < k:
        if len(arr) > i and arr[i] not in answer:
            answer.append(arr[i])
        elif len(arr) <= i:
            answer.append(-1)
        i += 1
    return answer