def solution(arr):
    x = 0
    while(True):
        next = []
        for i in arr:
            if i >= 50 and i % 2 == 0 :
                next.append(int(i/2))
            elif i < 50 and i % 2 == 1:
                next.append(i*2 + 1)
            else:
                next.append(i)
                
        if arr == next:
            return x
        else:
            x = x + 1
            arr = next