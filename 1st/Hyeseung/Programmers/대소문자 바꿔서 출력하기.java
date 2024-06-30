import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        
        for(Character c : str.toCharArray()){
            if(Character.isUpperCase(c)) answer += Character.toLowerCase(c);
            else if(Character.isLowerCase(c)) answer += Character.toUpperCase(c);
        } 
        
        System.out.println(answer);
    }
}