class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder(number);
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < answer.length() - 1; j++) {
                char fc = answer.charAt(j);
                char bc = answer.charAt(j + 1);
                if (fc < bc) {
                    answer.delete(j, j + 1);
                    break;
                } else {
                    if (j + 2 == answer.length()) {
                        answer.delete(j + 1, j + 2);
                    }
                }
            }
        }
        return answer.toString();
    }
}

// 앞뒤 비교 - 앞이크면 넘어가기 뒤가크면 앞제거
// 