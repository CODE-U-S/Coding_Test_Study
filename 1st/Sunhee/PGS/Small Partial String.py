def solution(t, p):
    answer = 0
    t_len = len(t)
    p_len = len(p)
    p = int(p)
    for i in range(0,t_len+1-p_len):
        if int(t[i:i+p_len]) <= p:
            answer+=1
    return answer
