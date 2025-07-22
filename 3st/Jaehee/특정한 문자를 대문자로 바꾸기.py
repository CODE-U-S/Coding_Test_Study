def solution(my_string, alp):
    answer = my_string.title()
    if alp in "x":
        answer=my_string.lower()
        print(answer)
    return answer