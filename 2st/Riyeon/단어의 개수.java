import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    str = str.trim();
	    
	    int num = 0;
	    if(str.length() != 0){
	        String arr[] = str.split(" ");
	        num = arr.length;
	    }
	    
	    System.out.println(num);
	}
}