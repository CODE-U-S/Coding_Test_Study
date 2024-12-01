class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] vowels = {"a", "e", "i", "o", "u"};
        
        for (String v : vowels) {
            answer = answer.replaceAll(v, "");
        }
        
        return answer;
    }
}