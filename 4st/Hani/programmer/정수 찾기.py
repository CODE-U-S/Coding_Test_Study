def solution(num_list, n):
    answer = 0
       
    for i in range(len(num_list)) :
        if (num_list[i] == n) :
            answer = 1
            break
        else :
            answer = 0

    return answer