import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon_No_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		double avg;
		ArrayList<Integer> score = new ArrayList<>();
		for(int i = 0; i < n; i++)
			score.add(sc.nextInt());
		
		for(int i = 0; i < n; i++)
			sum += score.get(i);
		
		avg = (double)sum / n;
		System.out.println((double)avg / Collections.max(score) * 100);
	}
}
