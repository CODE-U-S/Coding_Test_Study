import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int row_count = 0, col_count = 0;
		char bodyguard[][] = new char[x][y];
		
		for(int i = 0; i < x; i++) {
			boolean count = true;
			String str = sc.next();
			for(int j = 0; j < y; j++) {
				bodyguard[i][j] = str.charAt(j);
				if(bodyguard[i][j] == 'X') count=false;		
			}
			if(count) col_count++;
		}
		for(int i = 0; i < y; i++) {
			boolean count = true;
			for(int j = 0; j < x; j++) {
				if(bodyguard[j][i] == 'X') count=false;
			}
			if(count) row_count++;
		}
		System.out.println(row_count < col_count ? col_count : row_count);
	}
}
