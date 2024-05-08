def solution(s):
    answer = []
    s_dict = dict()
    
    for i in range(len(s)):
        if s[i] not in s_dict:
            answer.append(-1)
        else:
            answer.append(i-s_dict[s[i]])
        s_dict[s[i]] = i
        
    return answer