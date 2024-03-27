	#include <stdio.h>

int main(){
    int a, b, c;
    int multiple_num;
    int each_digit[10] = {0,};
    scanf("%d\n%d\n%d", &a, &b, &c);
    multiple_num = a * b * c;
    do{
        each_digit[multiple_num % 10]++;
        multiple_num /= 10;
    }while(multiple_num != 0);

    for(int i = 0; i < 10; i++){
        printf("%d\n", each_digit[i]);
    }
}
