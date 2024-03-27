import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		double number[] = new double[num];
		double max = 0, sum = 0;
		for(int i = 0; i < num; i++) {
			number[i] = sc.nextInt();
			if(max < number[i]) max = number[i];
		}
		
		for(int i = 0; i < num; i++) {
			number[i] = number[i] / max * 100;
			sum += number[i];
		}
		System.out.println(sum / num);
	}

}
