a,b,c = map(int, input().split())
p1=(a+b)%c
p2=((a%c)+(b%c))%c
p3=(a*b)%c
p4=((a%c)*(b%c))%c
print(p1, p2, p3, p4, sep='\n')