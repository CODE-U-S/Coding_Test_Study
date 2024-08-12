def solution(num_list, n):
    answer = []
    answer = num_list[n:]+num_list[:n]
    return answer