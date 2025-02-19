import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();  // 문자열 입력 받기

        // 문자열의 각 문자를 한 줄씩 출력
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }

        sc.close();  // 자원 누수를 방지하기 위해 Scanner 닫기
    }
}
