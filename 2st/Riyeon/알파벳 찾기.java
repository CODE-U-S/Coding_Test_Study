import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    
	    char ch = 'a';
	    for(int i=0; i<26; i++){
	        int idx = str.indexOf(String.valueOf(ch));
	        System.out.print(idx + " ");
	        ch++;
	    }
	}
}