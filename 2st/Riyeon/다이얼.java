import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    int cnt = 0;
	    while(str.length() > 0){
	        char ch = str.charAt(0);
	        str = str.substring(1);
	        
	        if(ch > 'V') cnt += 10;
	        else if(ch > 'S') cnt += 9;
	        else if(ch > 'O') cnt += 8;
	        else if(ch > 'L') cnt += 7;
	        else if(ch > 'I') cnt += 6;
	        else if(ch > 'F') cnt += 5;
	        else if(ch > 'C') cnt += 4;
	        else cnt += 3;
	    }
	    System.out.println(cnt);
	}
}