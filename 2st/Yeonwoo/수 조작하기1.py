def solution(n, control):
    answer = 0
    for i in control:
        if i == "w":
            n+=1
        elif i == "s":
            n-=1
        elif i == "d":
            n+=10
        elif i == "a":
            n-=10
    answer = n
    return answer