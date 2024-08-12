def solution(date1, date2):
    answer = 0
    if date1[0] < date2[0]:
        answer = 1
    elif date1[0] == date2[0] and date1[1] < date2[1]:
        answer = 1
    elif date1[0] == date2[0] and date1[1] == date2[1] and date1[2] < date2[2]:
        answer = 1
    return answer