class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for(int i = 0; i < code.length(); i++){
            if(mode == 0){
                if(code.charAt(i) == '1')
                    mode = 1;
                else if(i % 2 == 0)
                    answer += code.charAt(i);
            }else if(mode == 1){
                if(code.charAt(i) == '1')
                    mode = 0;
                else if(i % 2 != 0)
                    answer += code.charAt(i);
            }
        }
        if(answer == "") return "EMPTY";
        return answer;
    }
}
