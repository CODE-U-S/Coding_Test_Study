import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<10; i++){
		    int num = sc.nextInt();
		    set.add(num % 42);
		}
		System.out.println(set.size());
	}
}