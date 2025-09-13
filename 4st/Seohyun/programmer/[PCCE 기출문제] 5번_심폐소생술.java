class Solution {
    public int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for(int i=0; i<
5
; i++){
            for(int j=0; j<
5
; j++){
                if(cpr[i].equals(basic_order[j])){
                    answer[i] = 
j+1
;
                    break;
                }
            }
        }
        return answer;
    }
}