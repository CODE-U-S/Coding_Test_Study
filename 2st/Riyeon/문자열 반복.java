import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    for(int i=0; i<n; i++){
	        int num = sc.nextInt();
	        String str = sc.next();
	        
	        for(char ch : str.toCharArray()){
	            for(int j=0; j<num; j++)
	                System.out.print(ch);
	        }
	        System.out.println();
	    }
	}
}