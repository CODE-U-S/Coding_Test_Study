import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=2; i<=Math.sqrt(n); i++){
		    while(n % i == 0){
		        System.out.println(i);
		        n/=i;
		    }
		}
		
		if(n != 1){
		    System.out.println(n);
		}
	}
}