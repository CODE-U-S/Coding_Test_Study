def solution(my_string, s, e):
    # 세 부분으로 나누기
    front = my_string[:s]       # s 이전
    middle = my_string[s:e+1]   # s~e
    back = my_string[e+1:]      # e 이후
    
    # 가운데 부분만 뒤집어서 이어붙이기
    return front + middle[::-1] + back
