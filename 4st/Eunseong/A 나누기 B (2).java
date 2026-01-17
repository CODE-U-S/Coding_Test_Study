import java.util.*;
import java.math.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);       

        BigDecimal A = scan.nextBigDecimal();
        BigDecimal B = scan.nextBigDecimal();

        BigDecimal result = A.divide(B, 1000, RoundingMode.DOWN);
        
        System.out.println(result.toString());
    }
}
