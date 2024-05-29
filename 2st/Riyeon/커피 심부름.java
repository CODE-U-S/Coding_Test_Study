class Solution {
    public int solution(String[] order) {
        String[] s = {"iceamericano", "americanoice", "hotamericano", "americanohot", "americano", "anything", "icecafelatte", "cafelatteice", "hotcafelatte", "cafelattehot", "cafelatte"};
        
        int answer = 0;
        for(String sod : order){
            for(int i=0; i<s.length; i++){
                if(sod.equals(s[i]))
                    answer += i<=5? 4500 : 5000;
            }
        }
        
        return answer;
    }
}