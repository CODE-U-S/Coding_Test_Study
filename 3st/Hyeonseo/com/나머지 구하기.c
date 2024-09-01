#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    int answer = num1 % num2;
    return answer;
}
int main() {
    int num1,num2;
    scanf("%d %d",&num1,num2);
    solution(num1,num2);
}