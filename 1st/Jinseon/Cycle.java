import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cycle, cycle_1, cycle_10, count = 0;
		
		cycle = sc.nextInt();
		int break_number = cycle;
		
		while(true) {
			cycle_1 = cycle % 10;
			cycle_10 = cycle / 10;
			cycle = (cycle_1 + cycle_10) % 10 + cycle_1 * 10;
			count++;
			if(cycle == break_number) break;
		}
		System.out.println(count);
	}
}
