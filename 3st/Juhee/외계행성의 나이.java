class Solution {
    public String solution(int age) {
        String[] str = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        StringBuilder answer = new StringBuilder();

        while (age > 0) {
            int digit = age % 10;
            answer.insert(0, str[digit]);
            age /= 10;
        }

        return answer.toString();
    }
}
