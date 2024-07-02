import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        String[] str = {"12345", "21232425", "3311224455"};
        String ans = "";
        for(int i: answers)
            ans += String.valueOf(i);
        int ai=0, an=0, bi=0, bn=0, ci=0, cn=0;
        
        for(int i=0; i<ans.length(); i++){
            if(ans.charAt(i) == str[0].charAt(ai++)) an++;
            if(ans.charAt(i) == str[1].charAt(bi++)) bn++;
            if(ans.charAt(i) == str[2].charAt(ci++)) cn++;
            if(ai == str[0].length()) ai=0;
            if(bi == str[1].length()) bi=0;
            if(ci == str[2].length()) ci=0;
        }
        
        int[] arr = {an, bn, cn};
        Arrays.sort(arr);
        if(arr[1] != arr[2]){
            if(arr[2] == an) return new int[] {1};
            else if(arr[2] == bn) return new int[] {2};
            else return new int[] {3};
        }else if(arr[0] != arr[2]){
            if(arr[0] == an) return new int[] {2, 3};
            else if(arr[0] == bn) return new int[] {1, 3};
            else return new int[] {1, 2};
        }else
            return new int[] {1, 2, 3};
    }
}