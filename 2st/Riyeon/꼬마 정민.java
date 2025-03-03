import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long sum = 0;
		for(int i=0; i<3; i++){
		    sum += sc.nextLong();
		}
		System.out.println(sum);
	}
}