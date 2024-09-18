def solution(phone_number):
    answer = '*' * (len(phone_number)-4)
    answer += phone_number[-4:]
    return answer