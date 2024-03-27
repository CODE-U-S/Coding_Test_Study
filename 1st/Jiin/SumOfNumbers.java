import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, answer = 0;
        String number;
        n = sc.nextInt();
        number = sc.next();
        for(int i = 0; i < n; i++)
            answer += number.charAt(i) - 48;
        System.out.println(answer);
    }
}
