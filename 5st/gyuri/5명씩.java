class Solution {
    public String[] solution(String[] names) {
        
        int count = 0;
             for(int i=0; i < names.length; i++){
            if(i%5==0){
                count++;
            }
        }
        
        String[] answer = new String[count];
        
        int idx = 0;
        
        for(int i=0; i < names.length; i++){
            if(i%5==0){
                answer [idx] = names[i];
                idx++;
            }
        }
        return answer;
    }
}