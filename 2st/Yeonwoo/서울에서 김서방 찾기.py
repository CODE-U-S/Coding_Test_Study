def solution(seoul):
    answer = ''
    str_1 = "김서방은 "
    str_2 = "에 있다"
    for i, name in enumerate(seoul):
        if name == "Kim":
            answer = str_1+str(i)+str_2
    return answer