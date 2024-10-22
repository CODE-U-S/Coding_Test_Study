class Solution {
    public String solution(String myString) {
        // 결과 문자열을 저장할 StringBuilder 사용
        StringBuilder answer = new StringBuilder();
        
        // 문자열을 순회하며 조건에 맞게 변환
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            
            if (ch == 'a') {
                // 'a'는 'A'로 변환
                answer.append('A');
            } else if (Character.isUpperCase(ch) && ch != 'A') {
                // 'A'가 아닌 대문자는 소문자로 변환
                answer.append(Character.toLowerCase(ch));
            } else {
                // 그 외의 문자는 그대로 추가
                answer.append(ch);
            }
        }
        
        // 결과를 String으로 변환하여 반환
        return answer.toString();
    }
}