package Sojeong;

import java.util.Scanner;
import java.lang.Math;

public class BOJ_2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(), m = sc.nextInt();
        System.out.println(Math.abs(n - m));
    }
}
