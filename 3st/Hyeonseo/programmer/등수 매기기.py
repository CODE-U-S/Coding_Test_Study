def solution(score):
    n = len(score)
    answer = [1] * n
    score_sum = [sum(s) for s in score]  
    for i in range(n):
        for j in range(n):
            if score_sum[i] < score_sum[j]:
                answer[i] += 1
    return answer
