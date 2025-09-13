class Solution {
    public String solution(int age) {
        String answer = age + "";
        answer = answer.replaceAll("0", "a");
        answer = answer.replaceAll("1", "b");
        answer = answer.replaceAll("2", "c");
        answer = answer.replaceAll("3", "d");
        answer = answer.replaceAll("4", "e");
        answer = answer.replaceAll("5", "f");
        answer = answer.replaceAll("6", "g");
        answer = answer.replaceAll("7", "h");
        answer = answer.replaceAll("8", "i");
        answer = answer.replaceAll("9", "j");
        return answer;
    }
}