#include <stdio.h>
#include <stdlib.h>

int main() {
	int n, m, num;
	scanf("%d %d", &n, &m);
	int* result = (int *)malloc(sizeof(int) * n * m);
	for (int i = 0; i < n * m; i++)
		result[i] = 0;

	for (int i = 0; i < n*m*2; i++) {
		scanf("%d", &num);
		result[i%(n*m)] += num;
	}

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			printf("%d ", result[(i % n * m) + (j % m)]);
		}
		printf("\n");
	}
}
