def solution(money):
    answer = []
    temp = 0 #남는 돈
    count = 0
    
    while money >= 5500 : 
        count += 1
        money = money - 5500
    
    answer = [count, money]
    return answer