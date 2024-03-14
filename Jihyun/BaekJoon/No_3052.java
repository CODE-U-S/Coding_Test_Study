package BaekJoon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            a.add(sc.nextInt() % 42);

        int cnt = 1;
        int tmp = a.get(0);
        for(int i = 0; i < 10; i++)
            if(a.get(i) != tmp) {
                tmp = a.get(i);
                cnt++;
            }
        System.out.println(cnt);
    }
}
