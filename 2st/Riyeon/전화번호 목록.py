def solution(phone_book):
    phone_book.sort()
    for i in range(len(phone_book)-1):
        n = phone_book[i]
        if n in phone_book[i+1][:len(n)]:
            return False
    return True