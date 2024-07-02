import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[strArr.length];
        for(int i=0; i<arr.length; i++){
            arr[strArr[i].length()]++;
        }
        
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}