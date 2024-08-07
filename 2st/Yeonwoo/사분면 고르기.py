A = int(input())
B = int(input())
if A > 0 and B > 0:
    print("1")
elif A < 0 and B > 0:
    print("2")
elif A < 0 and B < 0:
    print("3")
elif A > 0 and B < 0:
    print("4")