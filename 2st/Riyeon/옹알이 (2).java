class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String s : babbling){
            s = s.replaceAll("ayaaya|yeye|woowoo|mama", "1");
            s = s.replaceAll("aya|ye|woo|ma", "0");
            s = s.replaceAll("0", "");
            if(s.equals("")) answer++;
        }
        return answer;
    }
}