class Solution {
    public int solution(String number) {
        int answer =0;
        for (int i =0 ; i<number.length(); i++){
            char a = number.charAt(i);
            answer+=a-'0';

        }
        return answer%9;
    }
}
