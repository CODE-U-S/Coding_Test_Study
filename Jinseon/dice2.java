import java.util.Scanner;

public class dice_2476 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < number; i++) {
			int one = sc.nextInt();
			int two = sc.nextInt();
			int three = sc.nextInt();
			int money = 0;
			
			if(one == two && one == three) money = 10000 + one * 1000;
			else if(one == two) money = 1000 + one * 100;
			else if(one == three) money = 1000 + one * 100;
			else if(two == three) money = 1000 + two * 100;
			else money = Math.max(three, Math.max(one, two)) * 100;
			
			if(money > sum) sum = money;
		}
		System.out.println(sum);
		
	}
}
