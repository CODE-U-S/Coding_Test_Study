year = int(input())
age_type = input()

if age_type == "Korea":
    answer = 2030 - year + 1

elif age_type == "Year":
    answer = 2030 - year

print(answer)