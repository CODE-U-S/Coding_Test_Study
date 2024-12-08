def solution(t, p):
    answer = 0
    for i in range(len(t)-len(p)+1):
        if int(p) >= int(t[i : i+len(p)]):
            answer+=1
    return answer