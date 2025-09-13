import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    while(true){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        
	        if(a + b + c == 0){
	            break;
	        }
	        
	        String re = "";
	        int max = Math.max(a, Math.max(b, c));
	        if(max >= a+b+c-max ){
	            re = "Invalid";
	        }else if(a == b && a == c){
	            re = "Equilateral";
	        }else if(a != b && a != c && b != c){
	            re = "Scalene";
	        }else{
	            re = "Isosceles";
	        }
	        
	        System.out.println(re);
	    }
	}
}