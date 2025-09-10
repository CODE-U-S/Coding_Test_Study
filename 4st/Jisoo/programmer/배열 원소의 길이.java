class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        int sum=0;
        
        for(int i=0;i<strlist.length;i++){
            for(int j=0;j<strlist[i].length();j++){
                   sum=1+j;
            }
             answer[i]=sum;
        }
        
        return answer;
    }
}