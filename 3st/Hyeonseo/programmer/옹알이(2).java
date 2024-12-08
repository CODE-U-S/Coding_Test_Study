class Solution {
    public int solution(String[] babbling) {
        String[] str = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            String word = babbling[i];
            boolean isValid = true;

            for (int j = 0; j < str.length; j++) {
                // 연속된 동일 패턴이 있는지 확인
                if (word.contains(str[j] + str[j])) {
                    isValid = false;
                    break;
                }
                word = word.replace(str[j], " ");
            }

            // 유효한 경우만 answer 증가
            if (isValid && word.trim().length() ==ㄴ 0) {
                answer++;
            }
        }
        return answer;
    }
}
//level 1