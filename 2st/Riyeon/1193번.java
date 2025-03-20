import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int floor = 1;
	    
	    while(n - floor > 0){
	        n -= floor;
	        floor++;
	    }
	    
	    int hap = floor + 1;
	    int a=0, b=0;
	    
	    if(floor%2 == 1){
	        a = n;
	        b = hap - n;
	    }else{
	        b = n;
	        a = hap - n;
	    }
	    
	    System.out.println(b + "/" + a);
	}
}