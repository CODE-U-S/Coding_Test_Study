def solution(num_list, n):
    answer = []
    for i in num_list[::n]:
        answer.append(i)
    return answer