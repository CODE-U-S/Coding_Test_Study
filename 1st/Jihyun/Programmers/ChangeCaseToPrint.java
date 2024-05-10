import java.util.Scanner;

class ChangeCaseToPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String res = "";
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i))) {
                res += Character.toLowerCase(a.charAt(i));
            } else {
                res += Character.toUpperCase(a.charAt(i));
            }
        }
        System.out.println(res);
    }
}