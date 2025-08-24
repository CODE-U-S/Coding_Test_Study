class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i<absolutes.length; i++) {
            if (signs[i]==false)
                absolutes[i]=absolutes[i]*-1;
        }
        for(int i=0; i<absolutes.length; i++) {
            answer+=absolutes[i];
        }
        return answer;
    }
}