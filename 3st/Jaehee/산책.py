def solution(route):
    east = 0
    north = 0
    for i in route:
        if i == "N":
            north += 1
        elif i == "S" :  
            north -= 1
        elif i == "E" :
            east+=1
        elif i == "W":
            east-=1
    return [east, north]