#include <stdio.h>

int main(){
    int number, divide;
    scanf("%d\n%d",&number, &divide);
    
    //십의 자리까지 00으로 만들기
    number /= 100; number *= 100;
    
    while(number % divide != 0) number++;
    
    printf("%02d",number%100);
    
    return 0;
}
