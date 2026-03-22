class Solution {
    public String solution(String my_string) {
        String[] aeiou = {"a", "e", "i", "o", "u"};
        String answer = my_string;
        
        for(int i=0; i<aeiou.length; i++) {
            answer = answer.replace(aeiou[i], "");
        }
        return answer;
    }
}