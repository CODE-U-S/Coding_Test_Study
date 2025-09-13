import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    
	    boolean[] prime = new boolean[n+1];
	    for(int i=2; i<=n; i++){
	        prime[i] = true;
	    }
	    
	    for(int i=2; i*i<=n; i++){
	        if(prime[i]){
	            for(int j=i*i; j<=n; j+=i){
	                prime[j] = false;
	            }
	        }
	    }
	    
	    
	    int sum = 0;
	    int min = Integer.MAX_VALUE;
	    
	    for(int i=m; i<=n; i++){
	        if(prime[i]){
	            sum += i;
	            if(min == Integer.MAX_VALUE) min = i;
	        }
	    }
	    
	    if(sum == 0){
	        System.out.println(-1);
	    }else{
	        System.out.println(sum);
	        System.out.println(min);
	    }
	}
}