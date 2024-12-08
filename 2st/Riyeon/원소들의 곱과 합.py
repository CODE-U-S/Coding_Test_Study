def solution(num_list):
    answer = 1
    for i in num_list:
        answer *= i
    if answer > pow(sum(num_list), 2):
        return 0
    return 1