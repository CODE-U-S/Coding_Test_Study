def solution(order):
    answer = 0
    for i in order:
        if i=="iceamericano" or i=="americanoice" or i=="hotamericano" or i=="americanohot" or i=="americano" or i=="anything":
            answer += 4500
        else:
            answer += 5000
    return answer