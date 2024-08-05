def solution(s):
    answer = False
    count = 0
    if len(s) == 4 or len(s) == 6:
        for i in s:
            if i.isdigit()==True:
                count +=1
        if len(s) == count:
            answer = True
        else:
            answer = False
    return answer