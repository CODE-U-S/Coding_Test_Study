import java.util.Scanner;

public class Health_num {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int health_num = sc.nextInt();
		int bp = sc.nextInt();
		int min = bp;
		int max = sc.nextInt();
		int plus = sc.nextInt();
		int minus = sc.nextInt();
		int health_cnt = 0, all_time = 0;
		
		while(health_num != health_cnt) {
			if(min + plus > max) {
				all_time = -1;
				break;
			}
			all_time++;
			if(bp + plus <= max) {
				bp += plus;
				health_cnt++;
			}
			else {
				bp -= minus;
				if(bp < min) {
					bp = min;
				}
			}
		}
		System.out.println(all_time);
	}
}
