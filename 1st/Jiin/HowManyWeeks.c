#include <stdio.h>
#define ONE_WEEK 60*60*24*7

int main(){
    int factorial;
    scanf("%d", &factorial);
    long long int week=1;
    for(int i =1; i <= factorial; i++)
        week *= i;
    week /= ONE_WEEK;
    printf("%lld",week);
}