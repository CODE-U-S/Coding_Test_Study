def solution(rsp):
    rspdic = { '2':'0', '0':'5', '5':'2'}
    answer = ''
    for i in rsp:
        answer += rspdic[i]
    return answer