def solution(s):
    answer = ''
    temp = []
    cnt = 0
    for i in s:
        cnt = s.count(i)
        if cnt==1:
            temp.append(i)
    temp.sort()
    answer = ''.join(temp)
    return answer