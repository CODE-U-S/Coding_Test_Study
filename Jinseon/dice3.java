package day0611;
import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ran[] = new int[4];			
		
		for(int i = 0; i < 4; i++) {
			ran[i] = sc.nextInt();
		}
		
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
				if(ranCheckSum == 24) answer = 1111 * ran[0];				//2222
				else if(ranCheckSum == 12) {									//4414
					if(ranCheck[i] > ranCheck[j]) {
						answer = Math.pow(10 * ran[i] + ran[j], 2);						
					}
				}
				else if(ranCheckSum == 8) {										//6336
					if(ran[i] < ran[j]) {
						answer = (ran[i] + ran[j]) * Math.abs(ran[i] - ran[j]);	
					}
				}
				else if(ranCheckSum == 4) {
					if(ranCheck[i] == 2) {
						ran[i] = 1;
					}
					answer = ran[0] * ran[1] * ran[2] * ran[3];						//2526
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
		System.out.print((int)answer);
	}
}
