def solution(myString, pat):
    flipped = myString.translate(str.maketrans("AB", "BA"))
    return 1 if pat in flipped else 0
