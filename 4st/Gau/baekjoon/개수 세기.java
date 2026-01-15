import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();        // 정수 개수
        int[] arr = new int[N];      // 배열 선언

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();   // 입력 저장
        }

        int v = sc.nextInt();        // 찾는 값
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] == v) {
                count++;
            }
        }

        System.out.println(count);
    }
}