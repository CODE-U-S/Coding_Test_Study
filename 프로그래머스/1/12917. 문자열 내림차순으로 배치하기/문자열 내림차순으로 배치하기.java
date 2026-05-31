class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (arr[i] < arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int i : arr) {
            answer += (char)i;
        }
        
        
        
        return answer;
    }
}