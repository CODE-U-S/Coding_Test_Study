package Sunhee.programmers;


class Solution {
    public int solution(String s) {
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i=0;i<arr.length;i++) {
        	if(s.contains(arr[i])) {
        		s = s.replace(arr[i], Integer.toString(i));
        	}
        }
        return Integer.parseInt(s);
    }
}