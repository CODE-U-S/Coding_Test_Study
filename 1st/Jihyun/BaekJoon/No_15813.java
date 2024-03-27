package BaekJoon;
import java.util.HashMap;
import java.util.Scanner;

public class No_15813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> h = new HashMap<>();
        for(char i = 'A'; i <= 'Z'; i++)
            h.put(i, (int)i - 64);
        
        int s = sc.nextInt();
        String name = sc.next();
        int res = 0;
        for(int i = 0; i < s; i++)
            res += h.get(name.charAt(i));
        System.out.println(res);
    }
}