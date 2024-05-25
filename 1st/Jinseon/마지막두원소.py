def solution(num_list):
    answer = num_list
    len_ = len(num_list)
    if num_list[len_-1] > num_list[len_-2]:
        answer.append(num_list[len_-1] - num_list[len_-2])
    else:
        answer.append(num_list[len_-1] * 2)
    return answer
