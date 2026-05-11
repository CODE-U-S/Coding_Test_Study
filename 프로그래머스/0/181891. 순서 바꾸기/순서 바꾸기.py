def solution(num_list, n):
    answer = []
    for i in range(n, len(num_list), 1) :
        answer.append(num_list[i])
        
    for i in range(0, n, 1) :
        answer.append(num_list[i])
    return answer