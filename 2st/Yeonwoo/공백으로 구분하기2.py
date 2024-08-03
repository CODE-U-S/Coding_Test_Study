def solution(my_string):
    answer = []
    temp = []
    temp = my_string.split(" ")
    for i in temp:
        if i != "":
            answer.append(i)
    return answer