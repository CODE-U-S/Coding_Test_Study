class Solution {
    public String solution(String[] seoul) {
        String s = "";
        for(int i=0; i<seoul.length; i++)
            if(seoul[i].equals("Kim")){
                s = "김서방은 " + String.valueOf(i) + "에 있다";
            }
        return s;
    }
}