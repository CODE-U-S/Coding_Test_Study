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
//https://school.programmers.co.kr/learn/courses/30/lessons/133499
//머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다. 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워합니다. 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.