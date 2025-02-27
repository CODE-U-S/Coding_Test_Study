import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0, t = 1;
		for(int i=0; i<3; i++){
		    int n = num1 * (num2%10);
		    sum += n * t;
		    t*=10;
		    System.out.println(n);
		    num2 /= 10;
		}
		System.out.println(sum);
	}
}