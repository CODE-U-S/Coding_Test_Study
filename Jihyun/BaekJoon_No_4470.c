#include <stdio.h>

int main()
{
	int n;
	scanf("%d", &n);

	getchar();
	char a[n][60];

	for (int i = 0; i < n; i++)
		scanf("%[^\n]%*c", a[i]);  // 한 줄을 건너뛰었을 때만 다음 문자열로 이동

	for (int i = 0; i < n; i++)
		printf("%d. %s\n", (i + 1), a[i]);

	return 0;
}