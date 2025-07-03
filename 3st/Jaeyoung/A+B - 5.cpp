#include <stdio.h>

int main() {
    int num;
    bool condition = true;
    scanf("%d", &num);
    do
    {
        int a, b;
        scanf("%d %d", &a, &b);
        if(a == 0 && b == 0) {
            break;
        }
        printf("%d\n", a + b);
    } while (1);
    
    return 0;
}