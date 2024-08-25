class Solution {
    public String solution(int age) {
        int a = age/10/10;
        int b = age/10%10;
        int c = age%10;
        String [] str = {"a","b","c","d","e","f","g","h","i","j"};
        String answer = str[a]+str[b]+str[c];
         if (a == 0) {
            answer = str[b]+str[c];
        }
        return answer;
    }
}