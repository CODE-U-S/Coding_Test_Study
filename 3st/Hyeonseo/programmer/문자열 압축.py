def solution(s):
    if len(s) == 1:
        return 1
    
    answer = len(s) 
    
    for step in range(1, len(s)//2 + 1):
        compressed = ""   
        prev = s[0:step]  
        count = 1        
        
        for i in range(step, len(s), step):
            now = s[i:i+step]  
            if now == prev: 
                count += 1
            else:             
                compressed += (str(count) if count > 1 else "") + prev
                prev = now
                count = 1
        
        compressed += (str(count) if count > 1 else "") + prev
        
        answer = min(answer, len(compressed))
    
    return answer
