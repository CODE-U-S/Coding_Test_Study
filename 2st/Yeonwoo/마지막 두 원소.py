def solution(num_list):
    answer = []
    for i in num_list:
        answer.append(i)
    if answer[-1] > answer[-2]:
        answer.append(answer[-1]-answer[-2])
    elif answer[-1] <= answer[-2]:
        answer.append(answer[-1]*2)
    return answer