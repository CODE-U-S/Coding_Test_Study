import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    StringBuffer sb1 = new StringBuffer(sc.next());
	    StringBuffer sb2 = new StringBuffer(sc.next());
	    int n1 = Integer.parseInt(sb1.reverse().toString());
	    int n2 = Integer.parseInt(sb2.reverse().toString());
	    
	    int num = n1 > n2? n1 : n2;
	    System.out.println(num);
	}
}