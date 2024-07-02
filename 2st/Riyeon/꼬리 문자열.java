class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(String s : str_list){
            if(!s.contains(ex))
                answer += s;
        }
        return answer;
    }
}