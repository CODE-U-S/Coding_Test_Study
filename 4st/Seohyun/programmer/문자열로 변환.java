import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        while(n > 0){
            sb.append(n%10);
            n /= 10;
        }
        
        return sb.reverse().toString();
    }
}