def solution(num_list):
    answer = 0
    sum_ = sum(num_list)**2
    multiply_ = 1
    for i in num_list:
        multiply_ *= i
    if multiply_ < sum_:
        answer = 1
    elif multiply_ > sum_:
        answer = 0
    return answer