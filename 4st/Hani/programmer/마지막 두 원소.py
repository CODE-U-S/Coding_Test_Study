def solution(num_list):
    answer = []
    for i in range(len(num_list)) :
        answer.append(num_list[i])
            
    if num_list[len(num_list)-1] > num_list[len(num_list)-2] :
        answer.append(num_list[len(num_list)-1] - num_list[len(num_list)-2])
    elif num_list[len(num_list)-1] < num_list[len(num_list)-2] :
        answer.append(num_list[len(num_list)-1] * 2)
    return answer