import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    while(true){
	        int n1 = sc.nextInt();
	        int n2 = sc.nextInt();
	        
	        if(n1 == n2) break;
	        
	        String str = "";
	        if(n1 % n2 == 0){
	            str = "multiple";
	        }else if(n2 % n1 == 0){
	            str = "factor";
	        }else{
	            str = "neither";
	        }
	        
	        System.out.println(str);
	    }
	}
}