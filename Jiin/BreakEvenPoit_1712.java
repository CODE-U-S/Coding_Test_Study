import java.util.Scanner;

public class BreakEvenPoit_1712{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long variableCost, fixedCost, price;
        long bep = -1;
        fixedCost = sc.nextLong();
        variableCost = sc.nextLong();
        price = sc.nextLong();
        if(price > variableCost){
            bep = fixedCost/(price - variableCost) + 1;
        }
        System.out.println(bep);
    }
}