def solution(num_list):
    i = len(num_list) -1
    if num_list[i] > num_list[i-1]:
        num_list.append(num_list[i] - num_list[i-1])
    else:
        num_list.append(num_list[i] *2)
    return num_list