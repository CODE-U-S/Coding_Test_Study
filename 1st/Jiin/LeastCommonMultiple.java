import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int first, second, primeFactor = 2, result = 1;
        for(int i = 0; i < length; i++){
            result = 1;
            primeFactor = 2;
            first = sc.nextInt();
            second = sc.nextInt();
            while(first >= primeFactor && second >= primeFactor){
                if( first % primeFactor == 0 && second % primeFactor == 0){
                    first /= primeFactor;
                    second /= primeFactor;
                    result *= primeFactor;
                    primeFactor = 2;
                }else {
                	primeFactor++;
                }
            }
            result = result*first*second;
            System.out.println(result);
        }
    }
}
