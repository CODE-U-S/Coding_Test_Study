def solution(s):
    answer = ''
    temp = []
    num = []
    temp = s.split(' ')
    for i in temp:
        num.append(int(i))
        num.sort()
    answer+=(str(num[0])+' '+str(num[-1]))
    return answer