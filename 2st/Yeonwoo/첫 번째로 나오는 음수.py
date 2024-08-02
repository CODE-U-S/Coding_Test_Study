def solution(num_list):
    answer = 0
    for i, j in enumerate(num_list):
        if j < 0:
            answer = i
            break
        else:
            answer = -1
    return answer