import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        String str = a + b;
        String replaceStr = str.replace(" ", "");ㄴ
        System.out.println(replaceStr);
    }
}