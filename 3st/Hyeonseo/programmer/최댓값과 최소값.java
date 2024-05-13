class Solution {
    public String solution(String s) {
		String[] str = s.split(" ");
        int[] number = new int[str.length];
        for(int i = 0; i < str.length; i++) {
        	number[i] = Integer.parseInt(str[i]); 
        }
        int max=number[0];
        int min=number[0];
        for(int i=0;i<number.length;i++){
             max=Math.max(max,number[i]);
             min=Math.min(min,number[i]);
        }
        return min + " " + max; 
    }
}