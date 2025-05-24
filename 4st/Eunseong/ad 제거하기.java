class Solution {
    public String[] solution(String[] strArr) {
        int cnt = 0;
        
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) {
                continue;
            }
            cnt++;
        }
        String[] answer = new String[cnt];
        cnt = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) {
                continue;
            }
            answer[cnt++] = strArr[i];
        }
        
        return answer;
    }
}