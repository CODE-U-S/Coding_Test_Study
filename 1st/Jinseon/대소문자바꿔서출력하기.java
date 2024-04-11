import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for(int i =0; i < a.length(); i++){
            char word = a.charAt(i);
            if(Character.isUpperCase(word)){
                answer += Character.toLowerCase(word);
            } else {
                answer += Character.toUpperCase(word);
            }
        }
        
        System.out.print(answer);
    }
}