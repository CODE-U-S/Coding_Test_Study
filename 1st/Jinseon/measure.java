package day_230903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class measure {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int measure = Integer.parseInt(br.readLine());
		
		int max = Integer.MIN_VALUE; //int에 들어갈 수 있는 값 중에 가장 작은 값
		int min = Integer.MAX_VALUE; //int에 들어갈 수 있는 값 중에 가장 큰 값
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ", false);
		//bufferedReader는 한줄씩 불러오기 때문에 StringToken으로 쪼갬.(문자열, 구분자, 구분자도 토큰에 넣을 것인가?)
		
		while(measure-- > 0) {
			int i = Integer.parseInt(st.nextToken()); //nextToken : 다음 토큰~
			max = max < i ? i : max;
			min = min > i ? i : min;
		}
		System.out.println(max * min);
	}

}
