import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon_No_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            a.add(sc.nextInt() % 42);
<<<<<<< HEAD

        // Collections.sort(a);
=======
>>>>>>> 9fe7e126c7d1aa32f427083cfa4723169645a8d3
        
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
