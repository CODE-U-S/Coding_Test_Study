def solution(num_list):
    answer = []
    num_list.sort()
    for i in num_list[:5]:
        answer.append(i)
    return answer