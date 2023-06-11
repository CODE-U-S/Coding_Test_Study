package Sojeong.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1264 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input = br.readLine();
			String str = input.toLowerCase();
			int cnt = 0;
			
			if(str.equals("#")) break;
			
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		br.close();

	}
}
