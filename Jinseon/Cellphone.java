import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minSum = 0;
		int youngSum = 0;
		int num, time;
		num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			time = sc.nextInt();
			youngSum += ((time / 30) + 1) * 10;
			minSum += ((time / 60) + 1 ) * 15;
		}
		
		if(youngSum > minSum) {
			System.out.println("M "+ minSum);
		}
		else if(youngSum < minSum) {
			System.out.println("Y " + youngSum);
		}
		else {
			System.out.println("Y M " + youngSum);
		}
	}
}
