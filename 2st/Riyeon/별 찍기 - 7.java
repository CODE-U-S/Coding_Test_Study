import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = n;
		
		for(int i=n; i<n*2; i++){
		    for(int j=0; j<i; j++){
		        if(j < s-1){
		            System.out.print(" ");
		        }else{
		            System.out.print("*");
		        }
		    }
		    System.out.println();
		    s--;
		}
		
		for(int i=n*2-2; i>=n; i--){
		    for(int j=0; j<i; j++){
		        if(j < s+1){
		            System.out.print(" ");
		        }else{
		            System.out.print("*");
		        }
		    }
		    System.out.println();
		    s++;
		}
		
	}
}