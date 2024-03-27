class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int inx1 = 0;
        int inx2 = 0;
        for(String word : goal){
            if(inx1 < cards1.length && word.equals(cards1[inx1])){
                inx1++;
            }
            else if(inx2 < cards2.length && word.equals(cards2[inx2])){
                inx2++;
            } else {
                return "No";
            }
        }
        return answer;
    }
}