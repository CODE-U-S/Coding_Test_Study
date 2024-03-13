#include <stdio.h>

int main(){
    int youngest, second, oldest;
    scanf("%d\n%d", &youngest, &second);
    oldest = second - youngest + second;
    
    printf("%d", oldest);
    return 0;
}
