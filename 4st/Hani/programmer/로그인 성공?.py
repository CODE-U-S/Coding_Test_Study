def solution(id_pw, db):
    answer = ''
    for i in range(len(db)) :
        if (id_pw[0] == db[i][0]) :
            if (id_pw[1] == db[i][1]) :
                answer = "login"
            else :
                answer = "wrong pw"
                
    if answer == "" :
        answer = "fail"
    return answer