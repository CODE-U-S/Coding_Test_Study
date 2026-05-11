class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        String last = "";
        int[] answer = new int[str.length()];
        
        //문자열 뒤집기
        for (int i = str.length() - 1; i >= 0; i--) {
            last += str.charAt(i);
        }
        //배열에 넣기
        for (int i = 0; i < last.length(); i++) {
            answer[i] = last.charAt(i) - '0';
        }
        return answer;
    }
}