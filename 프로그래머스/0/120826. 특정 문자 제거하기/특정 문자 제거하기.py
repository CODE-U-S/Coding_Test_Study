def solution(my_string, letter):
    answer = ''
    
    for i in range(len(my_string)) :
        if my_string[i] != letter :
            answer += my_string[i]
        
    return answer