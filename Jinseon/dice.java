class Solution {
    public int solution(int a, int b, int c, int d) {
		int ran[] = new int[4];
        ran[0] = a;
        ran[1] = b;
        ran[2] = c;
        ran[3] = d;
		int ranCheck[] = {0, 0, 0, 0};
		int ranCheckSum = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(ran[i] == ran[j] && i != j) {
					ranCheck[i] += 1;
					ranCheck[j] += 1;
				}
			}
		}
		for(int i = 0; i < 4; i++) {
			ranCheckSum += ranCheck[i];
			
		}
		double answer = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(ranCheckSum == 24) answer = 1111 * ran[0];
				else if(ranCheckSum == 12) {									
					if(ranCheck[i] > ranCheck[j]) {
						answer = Math.pow(10 * ran[i] + ran[j], 2);						
					}
				}
				else if(ranCheckSum == 8) {
					if(ran[i] < ran[j]) {
						answer = (ran[i] + ran[j]) * Math.abs(ran[i] - ran[j]);	
					}
				}
				else if(ranCheckSum == 4) {
					if(ranCheck[i] == 2) {
						ran[i] = 1;
					}
					answer = ran[0] * ran[1] * ran[2] * ran[3];
				}
			}
		}
		int min = ran[0];
		if(ranCheckSum == 0) {
			for(int i = 1; i < ran.length; i++) {
				if(min > ran[i]) {
					min = ran[i];
				}
			}
			answer = min;
		}
		return (int)answer;
    }
}
