class Solution {
    public int solution(String number) {
        int answer = 0;
        for(String s:number.split("")){
            answer += Integer.parseInt(s);
        }
        answer %= 9;
        return answer;
    }
}