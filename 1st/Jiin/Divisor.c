#include <stdio.h>

int main(){
    int numOfDivisor;
    scanf("%d", &numOfDivisor);
    int min=1000000, max=1, num;
    for(int i = 0; i < numOfDivisor;i++){
        scanf("%d", &num);
        if(num>max) max=num;
        if(num<min) min=num;
    }
    printf("%d",min*max);
}