class Solution {
    public int solution(int order) {
        int answer = 0;
        String temp = Integer.toString(order);
        for(int i = 0 ; i < temp.length() ; i++){
            char ch = temp.charAt(i);
            if(ch == '3' || ch == '6' || ch == '9'){
                answer++;
            }
        }
        return answer;
    }
}