def solution(emergency):
    answer = [1] * len(emergency)
    s_emergency = sorted(emergency,reverse=True) 
    
    for i in range(len(emergency)):
        idx = s_emergency.index(emergency[i])
        answer[i] += idx
    return answer