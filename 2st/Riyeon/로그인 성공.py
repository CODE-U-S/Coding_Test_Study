def solution(id_pw, db):
    if id_pw in db:
        return 'login'
    for i in db:
        if id_pw[0] == i[0]:
            return 'wrong pw'
    return 'fail'