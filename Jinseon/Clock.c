#include<stdio.h>

int main() {
	int h, m;
	scanf("%d %d", &h, &m);

	while (1) {
		if (m < 45) {
			if (h == 0) {
				h = 24;
			}
			h -= 1;
			m += 60;
		}
		else {
			m += -45;
			break;
		}
	}

	printf("%d %d", h, m);
}
