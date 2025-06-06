class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0, num = 0;
        String pol[] = polynomial.split(" \\+ ");

        for (int i = 0; i < pol.length; i++) {
            if (pol[i].contains("x")) {
                if (pol[i].equals("x")) x++;
                else x += Integer.valueOf(pol[i].replace("x", ""));
            } else {
                num += Integer.valueOf(pol[i]);
            }
        }

        if (x == 0) {
            if (num == 0) return answer;
            else return answer += num;
        } else {
            if (x == 1) answer += "x";
            else answer += x + "x";
            if (num == 0) return answer;
            else return answer += " + " + num;
        }
    }
}