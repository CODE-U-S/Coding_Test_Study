def solution(cipher, code):
    answer = ''
    for i in range(1,len(cipher)//code+1):
        answer += cipher[(code*i)-1]
    return answer