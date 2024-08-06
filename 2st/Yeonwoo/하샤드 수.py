def solution(x):
    answer = True
    add = 0
    for i in str(x):
        add += int(i)
    if x%add==0:
        answer = True
    else:
        answer = False
    return answer