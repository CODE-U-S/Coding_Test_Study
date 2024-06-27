import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        args = a.split( "" );
        for ( int i = 0 ; i < args.length ; i++ ) 
            System.out.println ( args[i] );
    }
}