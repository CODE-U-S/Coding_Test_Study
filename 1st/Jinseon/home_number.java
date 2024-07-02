package 코딩테스트;

import java.util.Scanner;

public class home_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.nextLine();
			int count = 0;
			if(str.equals("0")) break;
			for(int i = 0; i < str.length(); i++) {
				String word = str.substring(i, i+1);
				
				if(word.equals("1")) count += 3; //1일 때
				else if(word.equals("0")) count += 5; //0일 때
				else count += 4;	//나머지 숫자일 때
			}
			System.out.println(count + 1);
		}
	}

}
