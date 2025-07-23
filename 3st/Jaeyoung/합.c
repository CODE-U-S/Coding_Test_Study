#include <stdio.h>

int main (){
    int n, i, ans = 0;
    scanf("%d", &n);
    for(i = 1; i <= n; i++){
        ans += i;
    }
    printf("%d", ans);
    return 0;
}