def solution(sizes):
    answer = 0
    
    re = [[0] * 2 for _ in range(len(sizes))]
    
    for i in range(len(sizes)) :
        if sizes[i][0] < sizes[i][1] :
            re[i][0] = sizes[i][1]
            re[i][1] = sizes[i][0]
        else :
            re[i][0] = sizes[i][0]
            re[i][1] = sizes[i][1]
    
    maxWidth, maxHeight = 0, 0
    
    for i in range(len(re)) :
        if re[i][0] > maxWidth :
            maxWidth = re[i][0]
            
    for i in range(len(re)) :
        if re[i][1] > maxHeight :
            maxHeight = re[i][1]
    
    answer = maxHeight * maxWidth
    return answer