class Solution {
    public String[] solution(String[] names) {
        int nl = names.length, cnt=0;
        String[] answer = new String[nl%5 != 0 ? nl/5 +1 : nl/5];
        for(int i=0; i<nl; i+=5, cnt++)
            answer[cnt] = names[i];
        return answer;
    }
}