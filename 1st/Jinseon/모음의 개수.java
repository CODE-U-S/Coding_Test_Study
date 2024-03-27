import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String list = sc.nextLine();
		while(true) {
			int count = 0;
			list = list.toLowerCase();
			if(list.equals("#")) break;
			for(int i = 0; i < list.length(); i++) {
				switch(list.charAt(i)) {
				case 'a': case 'e': case 'i': case 'o': case 'u': count++;
				default: break;
				}
			}
			System.out.println(count);
			list = sc.nextLine();
		}
	}

}
