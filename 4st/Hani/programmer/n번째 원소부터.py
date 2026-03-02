def solution(num_list, n):
    answer = []
    for i in range(n - 1, len(num_list)) :
        answer.append(num_list[i])
    return answer