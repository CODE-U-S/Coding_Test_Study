def solution(n):
    answer = ""
    temp = []
    s = str(n)
    
    for i in s :
        temp.append(int(i))
    temp = sorted(temp, reverse=True)
    
    for i in temp :
        answer += str(i)
    
    return int(answer)