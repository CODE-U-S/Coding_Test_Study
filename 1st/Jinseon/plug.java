import java.util.Scanner;

public class plug {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int plug[] = new int[num];
		int sum = 0;
		for(int i = 0; i < num; i++) {
			plug[i] = sc.nextInt();
			if(i == num - 1){
				sum += plug[i];
			} else {
				sum += plug[i] - 1;
			}
		}
		System.out.println(sum);
	}

}
