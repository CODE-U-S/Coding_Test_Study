import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] result = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result[i] = (char) (c + ('a' - 'A'));
            } else if (c >= 'a' && c <= 'z') {
                result[i] = (char) (c - ('a' - 'A'));
            } else {
                result[i] = c;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}