import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.replace("c=", "A");
		str = str.replace("c-", "A");
		str = str.replace("dz=", "A");
		str = str.replace("d-", "A");
		str = str.replace("lj", "A");
		str = str.replace("nj", "A");
		str = str.replace("s=", "A");
		str = str.replace("z=", "A");
		System.out.println(str.length());
	}
}