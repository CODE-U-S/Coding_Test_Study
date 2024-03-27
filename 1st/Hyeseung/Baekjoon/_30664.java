import java.math.BigInteger;
import java.util.Scanner;

public class _30664 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            BigInteger n = sc.nextBigInteger();
            if(n.intValue() == 0) break;
            System.out.println(n.remainder(new BigInteger("42")).compareTo(new BigInteger("0")) == 0 ? "PREMIADO" : "TENTE NOVAMENTE");
        }
    }
}