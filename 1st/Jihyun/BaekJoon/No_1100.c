#include <stdio.h>

int main()
{
	char a[9][9];
	int cnt = 0;
	for (int i = 0; i < 8; i++)
		scanf("%s", &a[i]);

	for (int i = 0; i < 8; i++)
		for (int j = 0; j < 8; j++)
			if ((j + i) % 2 == 0)
				if (a[i][j] == 'F')
					cnt++;

	printf("%d\n", cnt);
	return 0;
}