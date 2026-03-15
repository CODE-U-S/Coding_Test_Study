def solution(my_string, index_list):
    answer = ""
    temp = 0;
    for j in range(len(index_list)) :
        temp = index_list[j]
        answer += my_string[temp]
    return answer