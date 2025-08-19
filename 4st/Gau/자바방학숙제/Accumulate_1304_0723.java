import java.util.Scanner;
public class Accumulate_1304_0723 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        double sum=0.0; //합계
        int i=0;    //개수
        double num; //값

        do{
            System.out.print(i+1+"번째 숫자를 입력하세요 : ");
            num = sc.nextDouble();
            sum+=num;
            i++;
        }while(num!=0);
        i--;
        double avg=sum/i; //평균
        System.out.printf("입력한 숫자의 합은 %.2f 입니다.\n", sum);
        System.out.printf("입력한 숫자의 평균은 %.5f 입니다.", avg);
    }
}