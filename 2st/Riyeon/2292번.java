import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() - 1;
		int floor = 6;
		int cnt = n==0? 1 : 2;
		
		while(n - floor > 0){
		    n -= floor;
		    floor += 6;
		    cnt++;
		}
		
		System.out.println(cnt);
	}
}