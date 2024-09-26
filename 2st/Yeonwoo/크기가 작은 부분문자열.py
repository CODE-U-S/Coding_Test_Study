def solution(t, p):
    answer = 0
    for i in range(0,len(t)-len(p)+1):
        if int(t[i:i+len(p)]) <= int(p):
            answer+=1
    return answer