import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		
		int re=0;
		for(int i=0; i<str.length(); i++){
		    char ch = str.charAt(str.length()-1 -i);
		    if(ch >= 'A' && ch <= 'Z'){
		        re += (ch-55) * (int)Math.pow(n, i);
		    }else{
		        re += (ch-'0') * (int)Math.pow(n, i);
		    }
		}
		
		System.out.println(re);
	}
}