def solution(my_string):
    answer = ''
    no = ''
    for i in my_string:
        if i == "a" or i== "e" or i == "i" or i == "o" or i== "u":
            no += i
        else:
            answer += i

    return answer