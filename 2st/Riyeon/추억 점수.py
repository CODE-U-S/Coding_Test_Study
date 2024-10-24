def solution(name, yearning, photo):
    di = dict()
    for i in range(len(name)):
        di[name[i]] = yearning[i]
    
    answer = []
    for li in photo:
        num=0
        for i in li:
            if i in name:
                num += di[i]
        answer.append(num)
    return answer