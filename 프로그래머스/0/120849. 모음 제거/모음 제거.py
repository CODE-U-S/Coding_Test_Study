def solution(my_string):
    answer = ''
    for i in range(len(my_string)) :
        ch = my_string[i];
        if (ch != 'a' and ch != 'e' and ch != 'i' and ch != 'o' and ch != 'u') :
            answer += ch
    return answer