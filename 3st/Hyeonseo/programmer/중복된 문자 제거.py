def solution(my_string):
    answer = ""
    for ch in my_string:
        if ch not in answer:   # 아직 없는 문자일 때만 추가
            answer += ch
    return answer
