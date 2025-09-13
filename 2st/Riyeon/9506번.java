import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    while(true){
	        int n = sc.nextInt();
	        if(n == -1){
	             break;
	        }
	        
	        
	        List<Integer> li = new ArrayList<>();
	        li.add(1);
	        int sum = n-1;
	        for(int i=2 ; i<Math.sqrt(n); i++){
	            if(n % i == 0){
	                sum -= i + n/i;
	                li.add(i);
	                li.add(n/i);
	            }
	        }
	        
	        if(sum == 0){
	            Collections.sort(li);
	            System.out.print(n);
	            for(int i : li){
	                if(i == 1){
	                    System.out.print(" = " + i);
	                }else{
	                    System.out.print(" + " + i);
	                }
	            }
	        }else{
	            System.out.print(n + " is NOT perfect.");
	        }
	        System.out.println();
	    }
	}
}