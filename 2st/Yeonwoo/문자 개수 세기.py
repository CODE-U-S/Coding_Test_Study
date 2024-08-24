def solution(my_string):
    answer = [0]*52
    ar = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
    for i in my_string:
        for inx, j in enumerate(ar):
            if i==j:
                answer[inx]+=1
                break
    return answer