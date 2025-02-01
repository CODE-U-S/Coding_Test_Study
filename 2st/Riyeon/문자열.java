import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=0; i<n; i++){
	        String str = sc.next();
	        System.out.println(str.substring(0, 1) + str.substring(str.length()-1));
	    }
	}
}