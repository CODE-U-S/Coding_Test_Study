import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum = 0;
	    
	    for(int i=0; i<n; i++){
	        int num = sc.nextInt();
	        
	        boolean p = true;
	        for(int j=2; j < num; j++){
	            if(num%j == 0){
	                p = false;
	                break;
	            }
	        }
	        
	        if(num != 1 && p){
	            sum++;
	        }
	    }
	    
	    System.out.println(sum);
	}
}