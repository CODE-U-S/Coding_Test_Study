import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i))) answer += Character.toLowerCase(a.charAt(i));
            else answer += Character.toUpperCase(a.charAt(i));
        }
        System.out.print(answer);
    }
}