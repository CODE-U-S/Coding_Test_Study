def solution(num, k):
    answer = 0
    str_num = str(num)
    str_k = str(k)
    if str_k in str_num:
        for i in str_num:
            if str_k == i:
                answer = str_num.find(i)+1
    else:
        answer = -1
    return answer