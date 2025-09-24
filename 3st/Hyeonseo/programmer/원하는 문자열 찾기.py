def solution(myString, pat):
    # 대소문자 통일 (여기서는 소문자로 변환)
    myString = myString.lower()
    pat = pat.lower()
    
    # 부분 문자열 존재 여부 확인
    if pat in myString:
        return 1
    else:
        return 0
