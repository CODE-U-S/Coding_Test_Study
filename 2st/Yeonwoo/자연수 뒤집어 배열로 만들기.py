def solution(n):
    answer = []
    n_list = list(str(n))
    n_list.reverse()
    answer = list(map(int, n_list))
    return answer