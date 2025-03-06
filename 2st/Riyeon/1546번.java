import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int jumsu[] = new int[n];
		for(int i=0; i<n; i++){
		    jumsu[i] = sc.nextInt();
		}
		
		int max = 0;
		for(int i : jumsu){
		    max = Math.max(max, i);
		}
		
		double sum = 0;
		for(int i=0; i<n; i++){
		    sum += (double)jumsu[i] / max * 100;
		}
		
		System.out.println(sum/n);
	}
}