import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    for(int i=0; i<n; i++){
	        int[] re = new int[4];
	        int m = sc.nextInt();
	        
	        while(m >= 25){
	            m -= 25;
	            re[0]++;
	        }
	        while(m >= 10){
	            m -= 10;
	            re[1]++;
	        }
	        while(m >= 5){
	            m -= 5;
	            re[2]++;
	        }
	        re[3] = m;
	        
	        for(int j : re){
	            System.out.print(j + " ");
	        }
	        System.out.println();
	    }
	}
}