import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr=s.split("");
        int cnt=0;
        
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            cnt=0;
            for(int j=0; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    cnt++;
                }
            }
            if(cnt==1){
                answer+=arr[i];
            }            
        }
        return answer;
    }
}
