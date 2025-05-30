#include <stdio.h>

int main(void) {
    int a;
    scanf("%d", &a);
    if (a%2==0) printf("%d is even", a);
    else printf("%d is odd", a);
    return 0;
}