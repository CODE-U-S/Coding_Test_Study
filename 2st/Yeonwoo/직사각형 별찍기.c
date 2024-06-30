#include <stdio.h>

int main(void) {
    int n, m;
    int i, j;
    scanf("%d %d", &n, &m);
    for(i=0; i<m; i++) {
        for(j=0; j<n; j++) {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}