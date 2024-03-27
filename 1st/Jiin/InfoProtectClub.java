import java.util.Arrays;
import java.util.Scanner;

public class InfoProtectClub {

	public static void main(String[] args) {
		String clubs[] = {"$clear", "AlKor", "CyKor", "MatKor", "WiCys"}; 
		Scanner sc = new Scanner(System.in);
		char key = sc.nextLine().charAt(0);
		int low = 0, high = clubs.length - 1;
		int mid = high / 2;
		while(clubs[mid].charAt(0) != key) {
			if((int)clubs[mid].charAt(0) < (int)key)
				low = mid+1;
			if((int)clubs[mid].charAt(0) > (int)key)
				high = mid-1;
			mid = low + (high - low)/2;
		}
		System.out.println(clubs[mid]);
	}

}
//switch를 쓰고싶지만...만...만..만..... 재미가 없으므로 굳이 이진 탐색을 써보자!
