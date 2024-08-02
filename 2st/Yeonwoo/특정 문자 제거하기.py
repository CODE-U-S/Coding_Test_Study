def solution(my_string, letter):
    answer = ''
    no = ''
    for i in my_string:
        if i == letter:
            no += i
        else:
            answer += i
    return answer