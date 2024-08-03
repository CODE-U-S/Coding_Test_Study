def solution(num_list):
    answer = 0
    num_list_len = len(num_list)
    if num_list_len >= 11:
        for i in num_list:
            answer+=i
    elif num_list_len <= 10:
        answer = 1
        for i in num_list:
            answer *= i
    return answer