import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = str.length();
        for(int i = 0; i < a ; i++){
            System.out.println(str.charAt(i));
        }
    }
}