def solution(cipher, code):
    answer = ''
    for x in range(code-1, len(cipher), code) :
        answer += cipher[x]
    return answer