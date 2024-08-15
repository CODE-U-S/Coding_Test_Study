def solution(my_str, n):
    answer = []
    mo = len(my_str)//n
    na = len(my_str)%n
    if len(my_str)%n==0:
        for i in range(1,mo+1):
            answer.append(my_str[(i-1)*n:i*n])
    else:
        for i in range(1,mo+2):
            answer.append(my_str[(i-1)*n:i*n])
    return answer