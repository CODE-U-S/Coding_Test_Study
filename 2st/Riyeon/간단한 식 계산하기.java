class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] s = binomial.split(" ");
        if(s[1].equals("+"))
            answer = Integer.parseInt(s[0]) + Integer.parseInt(s[2]);
        else if(s[1].equals("-"))
            answer = Integer.parseInt(s[0]) - Integer.parseInt(s[2]);
        else
            answer = Integer.parseInt(s[0]) * Integer.parseInt(s[2]);
        return answer;
    }
}