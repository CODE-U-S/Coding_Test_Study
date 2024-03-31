package Sunhee.programmers;

class Solution {
    public String solution(String[] seoul) {
        int find = 0;
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                find = i;
                break;
            }
        }
        
        return "김서방은 " + find + "에 있다";
    }
}