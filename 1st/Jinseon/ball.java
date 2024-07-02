import java.util.Scanner;

public class ball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		int num = sc.nextInt();
		int cup[] = {1, 0, 0};
		for(int i = 0; i < num; i++) {
			int change_1 = sc.nextInt()-1;
			int change_2 = sc.nextInt()-1;
			temp = cup[change_1];
			cup[change_1] = cup[change_2];
			cup[change_2] = temp;
		}
		
		  for(int i = 0; i < cup.length; i++) {
			  if(cup[i] == 1) System.out.println(i+1);
		  }
		 
	}

}
