package BaekJoon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No_2953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> score = new ArrayList<>();
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++)
				sum += sc.nextInt();
			score.add(sum);
			sum = 0;
		}
		int max = Collections.max(score);
		int max_index = score.indexOf(max);
		System.out.println((max_index + 1) + " " + max);
	}
}