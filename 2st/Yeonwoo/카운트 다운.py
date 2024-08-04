def solution(start_num, end_num):
    answer = []
    for i in range(end_num, start_num+1):
        answer.append(i)
        answer.sort(reverse=True)
    return answer