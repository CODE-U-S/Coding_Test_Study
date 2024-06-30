import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // 한 단어만 입력받음
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            result.append(input.charAt(i));
            if (i != input.length() - 1) { // 마지막 문자가 아니면
                result.append("\n");
            }
        }
        System.out.println(result.toString());
        sc.close();
    }
}
