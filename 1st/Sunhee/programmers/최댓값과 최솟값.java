package Sunhee.programmers;

class Solution {
    public String solution(String s) {
        String answer = "";
      
        String[] str = s.split(" ");
        int[] num = new int[str.length]; 
        int min=Integer.MAX_VALUE; // int 값중 가장 큰값
        int max=Integer.MIN_VALUE; // int 값중 가장 작은값
        
        for(int i = 0; i < str.length; i++){
            num[i] = Integer.parseInt(str[i]); 
            if(min > num[i])
                min = num[i];
            if(max < num[i]) 
                max = num[i];
        }
        answer = min + " " + max;
        return answer;
    }
}
