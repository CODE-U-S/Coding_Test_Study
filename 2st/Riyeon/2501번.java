import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    int i=1, re=0;
	    
	    while(i <= n){
	        if(n % i == 0){
	            k--;
	            if(k == 0){
	                re = i;
	                break;
	            }
	        }
	        i++;
	    }
	    
	    System.out.println(re);
	}
}