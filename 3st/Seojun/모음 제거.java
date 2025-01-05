class Solution {
    public String solution(String my_string) {
   
        String vowels = "aeiou";
        

        StringBuilder answer = new StringBuilder();
 
        for (char c : my_string.toCharArray()) {

            if (vowels.indexOf(c) == -1) {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}

