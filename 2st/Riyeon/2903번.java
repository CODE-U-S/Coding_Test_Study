import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int dot = 2;
		for(int i=0; i<n; i++){
		    dot += dot-1;
		}
		
		System.out.println(dot * dot);
	}
}