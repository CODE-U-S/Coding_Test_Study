def solution(number):
    answer = 0
    sum = ""
    for i in number:
        sum += i
    answer = int(sum) % 9
    return answer
