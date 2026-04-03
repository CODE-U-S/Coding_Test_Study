def solution(num_list):
    answer = [0, 0]
    for i in range(len(num_list)) :
        if num_list[i] % 2 == 0 :
            answer[0] += 1
        elif num_list[i] % 2 == 1 :
            answer[1] += 1
    return answer