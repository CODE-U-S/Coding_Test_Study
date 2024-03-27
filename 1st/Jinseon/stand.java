package 코딩테스트;

import java.util.HashMap;
import java.util.Scanner;

public class stand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        HashMap<String,String> map1 = new HashMap<>(){{
            put("black","0");
            put("brown", "1");
            put("red", "2");
            put("orange", "3");
            put("yellow", "4");
            put("green", "5");
            put("blue", "6");
            put("violet", "7");
            put("grey", "8");
            put("white", "9");
        }};  // 색과 값을 저장하는 HashMap
        String color1 = sc.nextLine();
        String color2 = sc.nextLine();
        String color3 = sc.nextLine();
        long sum = Long.parseLong(map1.get(color1) + map1.get(color2));		//저항값 구하기
        sum *= Math.pow(10.0, (double)Integer.parseInt(map1.get(color3)));	//마지막 값 곱하기
        System.out.print(sum);
	}

}
