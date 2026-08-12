def solution(s):
    answer = 0
    
    # 해당 문자열과 해당 인덱스 일치 이용
    num = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"] 
    
    for i in range(len(num)) :
        s = s.replace(num[i], str(i))
        
    answer = int(s)
    return answer