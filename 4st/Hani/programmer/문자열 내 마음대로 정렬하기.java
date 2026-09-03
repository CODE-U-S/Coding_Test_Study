class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i];
        }

        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = 0; j < answer.length - 1 - i; j++) {

                // 문자가 더 큰 경우
                if (answer[j].charAt(n) > answer[j + 1].charAt(n)) {

                    String temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }

                // 문자가 같은 경우
                else if (answer[j].charAt(n) == answer[j + 1].charAt(n)) {
                    if (answer[j].compareTo(answer[j + 1]) > 0) {

                        String temp = answer[j];
                        answer[j] = answer[j + 1];
                        answer[j + 1] = temp;
                    }
                }
            }
        }

        return answer;
    }
}